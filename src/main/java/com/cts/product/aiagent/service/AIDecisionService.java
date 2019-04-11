package com.cts.product.aiagent.service;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.aiagent.AIConstants;
import com.cts.product.aiagent.dto.FulfillmentMessage;
import com.cts.product.aiagent.dto.InputRequest;
import com.cts.product.aiagent.dto.OutputResponse;
import com.cts.product.aiagent.dto.Parameters;
import com.cts.product.aiagent.dto.QueryResult;
import com.cts.product.aiagent.dto.Text;
import com.cts.product.profile.controller.ProfileController;
import com.cts.product.profile.domain.BaseResponse;
import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.rental.delegate.ReservationServiceDelegate;
import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;

@Service
public class AIDecisionService {

    @Autowired
    private ReservationServiceDelegate serviceDelegate;
    @Autowired
    private ProfileController profileController;

    public void commitReservationCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	RentalRequest initiateResReq = new RentalRequest();
	initiateResReq.setSession(request.getSession());
	initiateResReq.setResponseId(request.getResponseId());
	QueryResult queryResult = request.getQueryResult();
	queryResult.setAction("commitReservation");
	initiateResReq.setQueryResult(queryResult);
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, AIConstants.BRAND, AIConstants.CHANNEL,
		headers);
	if (StringUtils.isBlank(rentalResponse.getConfNumber())) {
	    response.setFulfillmentText(rentalResponse.getFulfillmentText());
	} else {
	    String ffText = queryResult.getFulfillmentText();
	    ffText = ffText.replace("confnumber", rentalResponse.getConfNumber());
	    response.setFulfillmentText(ffText);
	}
    }

    public void selectCarClassCall(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	RentalRequest initiateResReq = new RentalRequest();
	initiateResReq.setSession(request.getSession());
	initiateResReq.setResponseId(request.getResponseId());
	QueryResult queryResult = request.getQueryResult();
	queryResult.setAction("selectCarClass");
	initiateResReq.setQueryResult(queryResult);
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, AIConstants.BRAND, AIConstants.CHANNEL,
		headers);
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
	RentalResponse rentalResponse = serviceDelegate.delegate(initiateResReq, AIConstants.BRAND, AIConstants.CHANNEL,
		headers);
	response.setFulfillmentText(rentalResponse.getFulfillmentText());
	response.setSession(rentalResponse.getSession());
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

    public void initiateReseration(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	initiateReservationCall(request, response, headers);
	if (StringUtils.equals("Success", response.getFulfillmentText())) {
	    addDefaultFulfillment(response, request);
	} else {
	    addFulfillmentMessage(response, "I am sorry. Currently our system is down. Please try again later.");
	}
    }

    public BaseResponse<UserProfile> login(InputRequest request, OutputResponse response, HttpHeaders headers)
	    throws Exception {
	final Parameters p = request.getQueryResult().getOutputContexts().stream()
		.filter(c -> c.getName().endsWith(AIConstants.CARRENTAL)).findFirst().orElse(null).getParameters();
	LoginRequest loginRequest = populateLoginRequest(p);
	return profileController.login(loginRequest, AIConstants.BRAND, AIConstants.CHANNEL, AIConstants.LOYALTY,
		headers);
    }

    private LoginRequest populateLoginRequest(final Parameters p) {
	LoginRequest loginRequest = new LoginRequest();
	loginRequest.setUsername(p.getUserName());
	loginRequest.setPassword(p.getPassword());
	loginRequest.setRememberCredentials(p.isRememberCredentials());
	loginRequest.setAcceptDeclineVersion(p.getAcceptDeclineVersion());
	return loginRequest;
    }
}
