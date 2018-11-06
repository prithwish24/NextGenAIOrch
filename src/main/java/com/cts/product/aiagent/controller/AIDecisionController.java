package com.cts.product.aiagent.controller;

import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
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
import com.cts.product.aiagent.dto.InputRequest;
import com.cts.product.aiagent.dto.Intent;
import com.cts.product.aiagent.dto.OutputContext;
import com.cts.product.aiagent.dto.OutputResponse;
import com.cts.product.aiagent.dto.Parameters;
import com.cts.product.aiagent.dto.QueryResult;
import com.cts.product.aiagent.dto.Text;
import com.cts.product.lrd.Location;
import com.cts.product.lrd.LocationService;
import com.cts.product.rental.delegate.ReservationServiceDelegate;


@RestController
@RequestMapping("/services")
public class AIDecisionController {
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
		
		OutputResponse response = validateRequestAndTargetAction(request);
		if (hasOutputError(response)) {
			return response;
		}
		
		final String [] actionTokens = StringUtils.split(request.getQueryResult().getAction(), ACTION_SPLIT_DELIM, 2);
		if (actionTokens.length == 2 && "decision".equalsIgnoreCase(actionTokens[0])) {
			switch (actionTokens[1]) {
				case "initiate.request":
					initiateRequest(request, response);
					
					break;
				default:
					response = new OutputResponse();
					response.setError(997, "Invalid 'action' parameter");
			}
		} else {
			switch (request.getQueryResult().getAction()) {
				case "greetings":
					response = userGreetings(request);
					break;
				case "initiateRental":
					validateInitiateRentalData(request, response);
					if (hasOutputError(response)) 	break;
					response = getAvailableCarClasses(request);
					break;
				case "searchBranchesFromGps":
					response = searchBranchByGPSLocation(request);
					break;
				case "findRentalOffice":
					response = findRentalBranches(request);
					break;
				default:
					response = new OutputResponse();
					response.setError(997, "Invalid 'action' parameter");
			}
		}
		
		return response; 
	}

	
	private void initiateRequest(final InputRequest request, final OutputResponse response) {
		final OutputContext rentalContext = getCarRentalContext(request);
		final Parameters p = rentalContext.getParameters();

		// Check location
		if (StringUtils.isAllBlank(p.getGeoCity(), p.getAddress(), p.getZipCode())) {
			//addFulfilmentMessage(response, "From where you want to rent the vehicle?");
			//addFulfilmentEvent(response, "");
			return;
		}
		
		if (StringUtils.isAnyBlank(p.getDate(), p.getTime())) {
			addFulfilmentMessage(response, "When do you want to pickup the vehicle?");
			addFulfilmentEvent(response, "");
			return;
		}
		
		if (StringUtils.isBlank(p.getDuration())) {
			addFulfilmentMessage(response, "How long you need this car?");
			addFulfilmentEvent(response, "");
			return;
		}

		if (StringUtils.isBlank(p.getCarclass())) {
			addFulfilmentMessage(response, "What size of car you want? Mid-size, Standard or Full-size.");
			addFulfilmentEvent(response, "");
			return;
		}
		
		addAllContexts(response, request.getQueryResult().getOutputContexts());
	}

	private OutputResponse getAvailableCarClasses(InputRequest request) {
		OutputContext rentalContext = getCarRentalContext(request);
		final Parameters parameters = rentalContext.getParameters();
		
		return null;
	}


	/**
	 * This validation will be execute at slot filling time
	 * @param request
	 * @param response 
	 * @return
	 */
	private void validateInitiateRentalData(final InputRequest request, final OutputResponse response) {
		OutputContext rentalContext = getCarRentalContext(request);
		final Parameters parameters = rentalContext.getParameters();
		
		/*if (StringUtils.isAllBlank(
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
		}*/
		
		/*if (requestConverter.convertLocation(parameters.getLocation()) == null) {
			response.setError(110, "Cannot determine Location");
			return;
		}*/

		/*if (StringUtils.isAllBlank(
				parameters.getDate(),
				parameters.getTime())) {
			if (requestConverter.convertDateTime(parameters.getDate(), parameters.getTime()) == null) {
				response.setError(120, "Invalid pickup date and/or time");
				return;
			}
			
		} else {
			response.setError(1, "incomplete request");
		}*/

	}

	private void addFulfilmentMessage(final OutputResponse response, final String messageText) {
		if (response.getQueryResult() == null) {
			response.setQueryResult(new QueryResult());
		}
		response.getQueryResult().setFulfillmentText(messageText);
		
		FulfillmentMessage fulfillmentMessage = new FulfillmentMessage();
		response.getQueryResult().addFulfillmentMessage(fulfillmentMessage);
		
		Text text = new Text();
		fulfillmentMessage.setText(text);
		text.addText(messageText);
	}

	private void addFulfilmentEvent(OutputResponse response, String event) {
		FollowupEventInput followupEvent = new FollowupEventInput();
		followupEvent.setName(event);
		response.setFollowupEvent(followupEvent);
	}
	
	private void addAllContexts(OutputResponse response, List<OutputContext> outputContexts) {
		if (response.getQueryResult() == null) {
			response.setQueryResult(new QueryResult());
		}
		response.getQueryResult().setOutputContexts(outputContexts);
	}
	
	private OutputResponse userGreetings(InputRequest request) {
		OutputResponse response = new OutputResponse();
		response.setQueryResult(request.getQueryResult());
		return response;
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
			response.setError(998, "{"+intent.getName()+"}  Action cannot be empty.");
				
		}
		return response;
	}
	
	private OutputResponse searchBranchByGPSLocation (final InputRequest request) {
		OutputResponse response = new OutputResponse();
		response.setQueryResult(request.getQueryResult());
		return response;
	}
	
	private OutputResponse findRentalBranches ( final InputRequest request ) {
		OutputResponse response = new OutputResponse();
		response.setQueryResult(request.getQueryResult());
		
		response.getQueryResult().getOutputContexts().stream().forEach(ctx -> {
			if (ctx.getName().endsWith(CARRENTAL)) {
				Location ehiLoc = locationService.findBranchByLocation(ctx.getParameters().getPickupLocation());
				ctx.getParameters().setBranchCode(ehiLoc.getCode());
			}
		});
		
		return response;
	}

	private OutputContext getCarRentalContext (final InputRequest request) {
		return request.getQueryResult().getOutputContexts()
			.stream().filter(c -> c.getName().endsWith(CARRENTAL))
			.findFirst().orElse(null);		
	}
	
}
