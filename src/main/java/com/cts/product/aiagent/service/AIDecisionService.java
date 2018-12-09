package com.cts.product.aiagent.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.aiagent.dto.FollowupEventInput;
import com.cts.product.aiagent.dto.FulfillmentMessage;
import com.cts.product.aiagent.dto.InputRequest;
import com.cts.product.aiagent.dto.OutputContext;
import com.cts.product.aiagent.dto.OutputResponse;
import com.cts.product.aiagent.dto.Parameters;
import com.cts.product.aiagent.dto.QueryResult;
import com.cts.product.aiagent.dto.Text;
import com.cts.product.rental.delegate.ReservationServiceDelegate;
import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;

@Service
public class AIDecisionService {

    @Autowired
    private ReservationServiceDelegate serviceDelegate;

    private static final String CARRENTAL = "carrental";

    private static final String channel = "MOBILE";

    private static final String brand = "ENTERPRISE";

    public void renterInfoRequest(InputRequest request, OutputResponse response, HttpHeaders headers) throws Exception {
	final Parameters p = getRentalContextParams(request);
	if (StringUtils.isAnyBlank(p.getFirstName(), p.getLastName())) {
	    addFulfillmentMessage(response, "Can you spell that?");
	    addFulfillmentEvent(response, "EVNT_RENTERNAME_CALLBACK");
	    return;
	} else {
	    addDefaultFulfillment(response, request);
	    // call the reservation service from here ....
	    initiateReservationCall(request, response, headers);
	    if (StringUtils.equals("Success", response.getFulfillmentText())) {
		selectCarClassCall(request, response, headers);
		if (StringUtils.equals("Success", response.getFulfillmentText())) {
		    commitReservationCall(request, response, headers);
		}
	    }
	}
    }

    private void commitReservationCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	request.setSession(response.getSession());
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
		ffText = StringUtils.replaceFirst(ffText, "{confnumber}", rentalResponse.getConfNumber());
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

    private Parameters getRentalContextParams(final InputRequest request) {
	final OutputContext rentalContext = getCarRentalContext(request);
	return rentalContext.getParameters();
    }

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

    private OutputContext getCarRentalContext(final InputRequest request) {
	return request.getQueryResult().getOutputContexts().stream().filter(c -> c.getName().endsWith(CARRENTAL))
		.findFirst().orElse(null);
    }
}
