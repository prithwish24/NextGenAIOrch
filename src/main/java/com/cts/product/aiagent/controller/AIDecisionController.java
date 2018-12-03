package com.cts.product.aiagent.controller;

import java.io.IOException;
import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.aiagent.converter.RequestConverter;
import com.cts.product.aiagent.dto.Airport;
import com.cts.product.aiagent.dto.FollowupEventInput;
import com.cts.product.aiagent.dto.FulfillmentMessage;
import com.cts.product.aiagent.dto.FulfilmentPayload;
import com.cts.product.aiagent.dto.InputRequest;
import com.cts.product.aiagent.dto.Intent;
import com.cts.product.aiagent.dto.OutputContext;
import com.cts.product.aiagent.dto.OutputResponse;
import com.cts.product.aiagent.dto.Parameters;
import com.cts.product.aiagent.dto.Text;
import com.cts.product.lrd.LocationService;
import com.cts.product.rental.delegate.ReservationServiceDelegate;
import com.fasterxml.jackson.databind.JsonNode;


@RestController
@RequestMapping("/services")
public class AIDecisionController {
	private static Logger LOG = LoggerFactory.getLogger(AIDecisionController.class);
	private static final String CARRENTAL = "carrental";
	private static final String ACTION_SPLIT_DELIM = ".";

	@Autowired	private LocationService locationService;
	@Autowired	private RequestConverter requestConverter;
	@Autowired	private ReservationServiceDelegate serviceDelegate;
	
	@RequestMapping (
			value = "/ping", 
			method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.HEAD},
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String ping() {
		return "{\"success\":\"true\"}";
	}


	@RequestMapping(
			value = "/aihook",
			method = {RequestMethod.POST},
			produces = MediaType.APPLICATION_JSON_VALUE) 
	public @ResponseBody OutputResponse defaultGateway (
		   @RequestBody 	final InputRequest request,
		   @RequestHeader 	final HttpHeaders headers)  throws IOException {
		LOG.debug("Request :: " + requestConverter.logRequestOrResponse(request));
		
		OutputResponse response = validateRequestAndTargetAction(request);
		if (hasOutputError(response)) {
			return response;
		}
		
		final String [] actionTokens = StringUtils.split(
				request.getQueryResult().getAction(), ACTION_SPLIT_DELIM, 2);
		if (actionTokens.length == 2 && ("smalltalk".equalsIgnoreCase(actionTokens[0]) || "fallback".equalsIgnoreCase(actionTokens[0]))) {
			addDefaultFulfillment(response, request);
			addAllContexts(response, request.getQueryResult().getOutputContexts());
			
		}else if (actionTokens.length == 2 && "decision".equalsIgnoreCase(actionTokens[0])) {
			switch (actionTokens[1]) {
				case "initiate.request":
					initiateRequest(request, response);
					break;
				case "locationverify.request":
					locationVerifyRequest(request, response);
					break;
				case "nameverify.request":
					renterInfoRequest(request, response);
					break;
				default:
					response = new OutputResponse();
					Intent intent = request.getQueryResult().getIntent();
					response.setError(988, formatMsg("{0} :: Matching 'action' parameter not found", intent));
			}

		} else if (actionTokens.length == 2 && "data".equalsIgnoreCase(actionTokens[0])) {
			switch (actionTokens[1]) {
			case "select.carclass":
				getDetailPricing(request, response);
				break;
			default:
				response = new OutputResponse();
				Intent intent = request.getQueryResult().getIntent();
				response.setError(988, formatMsg("{0} :: Matching 'action' parameter not found", intent));
			}
			
		}	
		/*else {
			switch (request.getQueryResult().getAction()) {
				case "greetings":
					//response = userGreetings(request);
					break;
				case "initiateRental":
					validateInitiateRentalData(request, response);
					if (hasOutputError(response)) 	break;
					response = getAvailableCarClasses(request);
					break;
				case "searchBranchesFromGps":
					response = searchBranchByGPSLocation(request);
					break;
				default:
					response = new OutputResponse();
					Intent intent = request.getQueryResult().getIntent();
					response.setError(989, formatMsg("{0} :: Invalid 'action' parameter", intent));
			}
		}*/
		
		LOG.debug("Response :: " + requestConverter.logRequestOrResponse(response));
		
		return response; 
	}

	private void locationVerifyRequest(InputRequest request, OutputResponse response) {
		String pmsg = null, nmsg = null;
		JsonNode payload = getFulfilmentPayload(request.getQueryResult().getFulfillmentMessages());
		if (payload != null) {
			FulfilmentPayload fpayload = requestConverter.convertFulfilmentPayload(payload, FulfilmentPayload.class);
			pmsg = fpayload.getPositive();
			nmsg = fpayload.getNegetive();
		}
		
		Parameters p = getRentalContextParams(request);
		String branchCd = findRentalBranches(p);
		if (branchCd != null) {
			p.setBranchCode(branchCd);
			if (pmsg != null) {
				addFulfillmentMessage(response, pmsg);
			} else {
				addFulfillmentMessage(response, request.getQueryResult().getFulfillmentText());
			}
			
			addAllContexts(response, request.getQueryResult().getOutputContexts());
			
		} else { 
			// When Location not found 
			if (p.getAirport() != null) {
				addFulfillmentEvent(response, "EVNT_LOC_AIRPORT_CALLBACK");
				if (payload != null) {
					addFulfillmentMessage(response, nmsg);
				} else {
					addFulfillmentMessage(response, "Can you please tell me the airport code?");				
				}
				
			} else if (p.getGeoCity() != null) {
				addFulfillmentEvent(response, "EVNT_RENTERNAME_CALLBACK");
				if (payload != null) {
					addFulfillmentMessage(response, nmsg);
				} else {
					addFulfillmentMessage(response, "Which city you want to rent from?");				
				}
				
			} else if (p.getAddress() != null) {
				addFulfillmentEvent(response, "EVNT_LOC_ADDRESS_CALLBACK");
				if (payload != null) {
					addFulfillmentMessage(response, nmsg);
				} else {
					addFulfillmentMessage(response, "I could not find the address. Can you please tell me the address in full?");				
				}
				
			} else if (p.getZipCode() != null) {
				addFulfillmentEvent(response, "EVNT_RENTERNAME_CALLBACK");
				if (payload != null) {
					addFulfillmentMessage(response, nmsg);
				} else {
					addFulfillmentMessage(response, "I could not find the address. Can you please tell me the address in full?");				
				}
				
			}
			
			return;
		}
	}
	
	private void renterInfoRequest(InputRequest request, OutputResponse response) {
		final Parameters p = getRentalContextParams(request);
		if (StringUtils.isAnyBlank(p.getFirstName(), p.getLastName())) {
			addFulfillmentMessage(response, "Can you spell that?");
			addFulfillmentEvent(response, "EVNT_RENTERNAME_CALLBACK");
			return;
		} else {
			addDefaultFulfillment(response, request);
			
			// call the reservation service from here ....
		}
	}


	private void initiateRequest(final InputRequest request, final OutputResponse response) {
		final Parameters p = getRentalContextParams(request);

		// Check location
		if ( p.getAirport() == null || StringUtils.isAllBlank(p.getAddress(), p.getGeoCity(), p.getZipCode())) {
			addContext(response, request, "awaiting-location");
			addDefaultFulfillment(response, request);
			return;
		} else {
			String branchCd = findRentalBranches(p);
			if (branchCd != null) {
				p.setBranchCode(branchCd);
				//response.addOutputContext(rentalContext);
			} else {
				addFulfillmentMessage(response, "I could not find matching location. Can you please tell me your pickup location again?");
				addAllContexts(response, request.getQueryResult().getOutputContexts());
				return;
			}
		}
		
		if (StringUtils.isAnyBlank(p.getDate(), p.getTime())) {
			addFulfillmentMessage(response, "When do you want to rent the vehicle?");
			addFulfillmentEvent(response, "EVNT_DATE_CALLBACK");
			addAllContexts(response, request.getQueryResult().getOutputContexts());
			return;
		}
		
		if (StringUtils.isBlank(p.getDuration())) {
			addFulfillmentMessage(response, "How long you need this car?");
			addFulfillmentEvent(response, "EVNT_RENTDURATION_CALLBACK");
			addAllContexts(response, request.getQueryResult().getOutputContexts());
			return;
		}

		if (StringUtils.isBlank(p.getCarclass())) {
			addFulfillmentMessage(response, "What size of car you want? Mid-size, Standard or Full-size.");
			addFulfillmentEvent(response, "EVNT_CARCLASS_CALLBACK");
			addAllContexts(response, request.getQueryResult().getOutputContexts());
			return;
		}
		
		
	}

	private OutputResponse getAvailableCarClasses(InputRequest request) {
		return null;
	}

	private void getDetailPricing(InputRequest request, OutputResponse response) {
		final Parameters p = getRentalContextParams(request);
		
		// TODO call selectCarClass service to get price
		
		
		addFulfillmentMessage(response, "Here is your rental price for this car class. Shall I continue this booking?");
		addFulfillmentEvent(response, "EVNT_RENTERINFO_CALLBACK");
		return;
	}

	/**
	 * This validation will be execute at slot filling time
	 * @param request
	 * @param response 
	 * @return
	 */
	/*private void validateInitiateRentalData(final InputRequest request, final OutputResponse response) {
		OutputContext rentalContext = getCarRentalContext(request);
		final Parameters parameters = rentalContext.getParameters();
		
		if (StringUtils.isAllBlank(
				parameters.getAirport(),
				parameters.getAddress())) {
			response.setError(110, "Cannot determine pickup location");
			addFulfilmentMessage(response, "What location would you like to rent from?");
			return;
			
		} else {
			if (StringUtils.isNoneEmpty(parameters.getAirport())) {
				Airport airport = requestConverter.convertAirport(parameters.getAirport());
				if (airport == null) {
					response.setError(110, "Cannot determine pickup location");
					addFulfilmentMessage(response, "I could not find any airport named "+parameters.getAirport()+". Can you repeat it once again?");
					return;
				} else if (!airport.getCountry().contains("United States of America")) {
					response.setError(111, "Pickup location currently not supported");
					addFulfilmentMessage(response, "Pickup location currently not supported");
				}
			} else if (StringUtils.isBlank(parameters.getAddress())) {
				response.setError(110, "Cannot determine pickup location");
				addFulfilmentMessage(response, "What location would you like to rent from?");
				return;
			}
		}
		
		if (requestConverter.convertLocation(parameters.getLocation()) == null) {
			response.setError(110, "Cannot determine Location");
			return;
		}

		if (StringUtils.isAllBlank(
				parameters.getDate(),
				parameters.getTime())) {
			if (requestConverter.convertDateTime(parameters.getDate(), parameters.getTime()) == null) {
				response.setError(120, "Invalid pickup date and/or time");
				return;
			}
			
		} else {
			response.setError(1, "incomplete request");
		}

	}*/

	private void addDefaultFulfillment(final OutputResponse response, final InputRequest request) {
		response.setFulfillmentMessages(request.getQueryResult().getFulfillmentMessages());
		response.setFulfillmentText(request.getQueryResult().getFulfillmentText());
	}
	
	private void addFulfillmentMessage(final OutputResponse response, final String messageText) {
		response.setFulfillmentText(messageText);
		FulfillmentMessage fulfillmentMessage = new FulfillmentMessage();
		response.addFulfillmentMessage(fulfillmentMessage);
		
		Text text = new Text();
		fulfillmentMessage.setText(text);
		text.addText(messageText);
	}

	private void addFulfillmentEvent(OutputResponse response, String event) {
		FollowupEventInput followupEvent = new FollowupEventInput();
		followupEvent.setName(event);
		followupEvent.setLanguageCode("en-US");
		response.setFollowupEvent(followupEvent);
	}
	
	private void addAllContexts(OutputResponse response, List<OutputContext> outputContexts) {
		response.setOutputContexts(outputContexts);
	}
	private void addContext(OutputResponse response, InputRequest request, String context) {
		OutputContext locCtx = request.getQueryResult().getOutputContexts().stream()
				.filter(ctx -> ctx.getName().endsWith(context))
				.findFirst().orElse(null);
		if (locCtx != null) {
			response.addOutputContext(locCtx);
		}
	}
	
	private boolean hasOutputError (final OutputResponse response) {
		return (response.getError().getCode() != 0);
	}
	
	private OutputResponse validateRequestAndTargetAction (final InputRequest request) {
		OutputResponse response = new OutputResponse(); // Auto set SUCCESS
		if (request == null) {
			response.setError(999, "Empty request body");

		} else if (request.getQueryResult() == null || request.getQueryResult().getAction() == null) {
			Intent intent = request.getQueryResult().getIntent();	
			response.setError(998, formatMsg("Action cannot be empty", intent)); 
				
		}
		return response;
	}
	
	private OutputResponse searchBranchByGPSLocation (final InputRequest request) {
		OutputResponse response = new OutputResponse();
		response.setOutputContexts(request.getQueryResult().getOutputContexts());
		return response;
	}
	
	private String findRentalBranches(final Parameters p) {
		String branchCode = null;
		if (p.getAirport() != null) {
			Airport airport = p.getAirport(); //requestConverter.convertAirport(p.getAirport());
			branchCode = locationService.findBranch(airport);
			
		} else if (p.getGeoCity() != null) {
			branchCode = locationService.findBranch(p.getGeoCity());
			
		} else if (p.getAddress() != null) {
			branchCode = locationService.findBranch(p.getAddress());
			
		} else if (p.getZipCode() != null) {
			branchCode = locationService.findBranch(p.getZipCode());
			
		}
		return branchCode;
	}

	private OutputContext getCarRentalContext (final InputRequest request) {
		return request.getQueryResult().getOutputContexts()
			.stream().filter(c -> c.getName().endsWith(CARRENTAL))
			.findFirst().orElse(null);		
	}
	private Parameters getRentalContextParams(final InputRequest request) {
		final OutputContext rentalContext = getCarRentalContext(request);
		return rentalContext.getParameters();
	}
	private JsonNode getFulfilmentPayload (final List<FulfillmentMessage> fulfillmentMessages) {
		Optional<FulfillmentMessage> optional = fulfillmentMessages.stream().findFirst(); 
		if (optional.isPresent()) {
			return optional.get().getPayload();
		}
		return null;
	}

	private static String formatMsg (String template, Intent intent, String...args) {
		if (intent != null) {
			String name = StringUtils.isBlank(intent.getDisplayName())?intent.getName():intent.getDisplayName();
			String [] arr = StringUtils.split(name, '/');
			return MessageFormat.format(template, arr[arr.length-1]);
		}
		return template;
	}
}
