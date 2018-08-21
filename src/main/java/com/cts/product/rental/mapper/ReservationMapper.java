package com.cts.product.rental.mapper;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;

public class ReservationMapper {
    public static InitiateReservationRequest mapRequest(RentalRequest initiateAIRequest) {
	String pickupdate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getPickupdate();
	String pickuptime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getPickuptime();
	String returndate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getReturndate();
	String returntime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getReturntime();
	String pickupLocation = "STLT61";
	String returnLocation = pickupLocation;
	InitiateReservationRequest initiateReservationRequest = new InitiateReservationRequest();
	initiateReservationRequest.setPickupLocationId(pickupLocation);
	initiateReservationRequest.setReturnLocationId(returnLocation);
	initiateReservationRequest.setPickupTime(pickupdate + pickuptime);
	initiateReservationRequest.setReturnTime(returndate + returntime);
	return initiateReservationRequest;
    }

    public static RentalResponse mapResponse(ReservationResponse reservationResponse) {

	return null;
    }
}
