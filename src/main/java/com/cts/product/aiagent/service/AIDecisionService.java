package com.cts.product.aiagent.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.aiagent.dto.FulfillmentMessage;
import com.cts.product.aiagent.dto.InputRequest;
import com.cts.product.aiagent.dto.OutputResponse;
import com.cts.product.aiagent.dto.QueryResult;
import com.cts.product.aiagent.dto.Text;
import com.cts.product.rental.delegate.ReservationServiceDelegate;
import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;

@Service
public class AIDecisionService {

    @Autowired
    private ReservationServiceDelegate serviceDelegate;
    //@Autowired
    //private RequestConverter requestConverter;

    //private static final String CARRENTAL = "carrental";

    private static final String channel = "MOBILE";

    private static final String brand = "ENTERPRISE";

    /*public void rentalInfoRequest(InputRequest request, OutputResponse response, HttpHeaders headers) throws Exception {
    	String success = null, fail = null; //, noFirstName = null, noLastName = null;
    	JsonNode payload = getFulfilmentPayload(request.getQueryResult().getFulfillmentMessages());
    	if (payload != null) {
    	    FulfilmentPayload fpayload = requestConverter.convertFulfilmentPayload(payload, FulfilmentPayload.class);
    	    success = fpayload.getPositive();
    	    fail 	= fpayload.getNegetive();
    	    //noFirstName = fpayload.getNoFirstname();
    	    //noLastName = fpayload.getNoLastname();
    	} else {
    		fail = request.getQueryResult().getFulfillmentText();
    	}
    	
    	Parameters p = getRentalContextParams(request);
    	if (StringUtils.isAnyBlank(p.getFirstName(), p.getLastName())) {
    		addFulfillmentMessage(response, fail);
    	    addFulfillmentEvent(response, "EVNT_RENTER_FIRSTNAME_CALLBACK");
    	    
    	    // Add contexts. Replace renter-info context to firstname context
    	    OutputContext carRentalContext = getContext(request, CARRENTAL);
    	    OutputContext renterInfoContext = getContext(request, "awaiting-renter-info");
    	    renterInfoContext.setName("awaiting-firstname");
    	    response.addOutputContext(renterInfoContext);
    	    response.addOutputContext(carRentalContext);
    	    
    	} else {
    		//initiateReservationCall(request, response, headers);
    		//if (StringUtils.equals("Success", response.getFulfillmentText())) {
    			addFulfillmentEvent(response, "EVNT_RENTER_PHONE_CALLBACK");
    			addFulfillmentMessage(response, success);
    			response.setOutputContexts(request.getQueryResult().getOutputContexts());
    		//}
    	}
    }*/


	public void selectRentalCarClass(InputRequest request, OutputResponse response, HttpHeaders headers) throws Exception {
		/*String pmsg = null, nmsg = null;
    	JsonNode payload = getFulfilmentPayload(request.getQueryResult().getFulfillmentMessages());
    	if (payload != null) {
    	    FulfilmentPayload fpayload = requestConverter.convertFulfilmentPayload(payload, FulfilmentPayload.class);
    	    pmsg = fpayload.getPositive();
    	    nmsg = fpayload.getNegetive();
    	}*/
    	//initiateReservationCall(request, response, headers);
    	if (StringUtils.equals("Success", response.getFulfillmentText())) {
    		selectCarClassCall(request, response, headers);
    	}
    	//addFulfillmentEvent(response, "EVNT_RENTERINFO_CALLBACK");
	}
    
	public void commitRental(InputRequest request, OutputResponse response, HttpHeaders headers) throws Exception {
		//final Parameters p = getRentalContextParams(request);
		/*if (StringUtils.isAnyBlank(p.getFirstName(), p.getLastName())) {
	    addFulfillmentMessage(response, "Can you spell that?");
	    addFulfillmentEvent(response, "EVNT_RENTERNAME_CALLBACK");
	    return;
	} else {
	    addDefaultFulfillment(response, request);
	    // call the reservation service from here ....
	    commitReservationCall(request, response, headers);
	}*/

		commitReservationCall(request, response, headers);

	}

    private void commitReservationCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	request.setSession(request.getSession());
	RentalRequest initiateResReq = new RentalRequest();
	initiateResReq.setSession(request.getSession());
	initiateResReq.setResponseId(request.getResponseId());
	QueryResult queryResult = request.getQueryResult();
	queryResult.setAction("commitReservation");
	initiateResReq.setQueryResult(queryResult);
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, brand, channel, headers);
	if (StringUtils.isBlank(rentalResponse.getConfNumber())) {
	    response.setFulfillmentText(rentalResponse.getFulfillmentText());
	} else {
	    String ffText = queryResult.getFulfillmentText();
	    ffText = ffText.replace("{confnumber}", rentalResponse.getConfNumber());
	    response.setFulfillmentText(ffText);
	}
    }

    private void selectCarClassCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	request.setSession(response.getSession());
	RentalRequest initiateResReq = new RentalRequest();
	initiateResReq.setSession(request.getSession());
	initiateResReq.setResponseId(request.getResponseId());
	QueryResult queryResult = request.getQueryResult();
	queryResult.setAction("selectCarClass");
	initiateResReq.setQueryResult(queryResult);
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, brand, channel, headers);
	response.setFulfillmentText(rentalResponse.getFulfillmentText());
	response.setSession(rentalResponse.getSession());
    }

    private void initiateReservationCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	RentalRequest initiateResReq = new RentalRequest();
	initiateResReq.setSession(request.getSession());
	initiateResReq.setResponseId(request.getResponseId());
	QueryResult queryResult = request.getQueryResult();
	queryResult.setAction("initiateReservation");
	initiateResReq.setQueryResult(queryResult);
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, brand, channel, headers);
	response.setFulfillmentText(rentalResponse.getFulfillmentText());
	response.setSession(rentalResponse.getSession());
    }

    /*private Parameters getRentalContextParams(final InputRequest request) {
	final OutputContext rentalContext = getContext(request, CARRENTAL);
	return rentalContext.getParameters();
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

    /*private void addFulfillmentEvent(OutputResponse response, String event) {
	FollowupEventInput followupEvent = new FollowupEventInput();
	followupEvent.setName(event);
	followupEvent.setLanguageCode("en-US");
	response.setFollowupEvent(followupEvent);
    }

    private OutputContext getContext(final InputRequest request, final String conext) {
	return request.getQueryResult().getOutputContexts().stream().filter(c -> c.getName().endsWith(conext))
		.findFirst().orElse(null);
    }

    private JsonNode getFulfilmentPayload(final List<FulfillmentMessage> fulfillmentMessages) {
	Optional<FulfillmentMessage> optional = fulfillmentMessages.stream().findFirst();
	if (optional.isPresent()) {
	    return optional.get().getPayload();
	}
	return null;
    }*/


	public void initiateReseration(InputRequest request, OutputResponse response, HttpHeaders headers) throws Exception {
		initiateReservationCall(request, response, headers); 
		if (StringUtils.equals("Success", response.getFulfillmentText())) {
			addDefaultFulfillment(response, request);
		} else {
			addFulfillmentMessage(response, "I am sorry. Currently our system is down. Please try again later.");
		}
	}
}
