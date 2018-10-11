package com.cts.product.rental.mapper;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;

public class ReservationMapper {
    public static InitiateReservationRequest mapRequest(RentalRequest initiateAIRequest) {
	String pickupdate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getPickupdate();
	pickupdate = pickupdate.substring(0, pickupdate.indexOf("T"));
	String pickuptime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getPickuptime();
	pickuptime = pickuptime.substring(pickuptime.indexOf("T"), (pickuptime.indexOf(":") + 3));
	String returndate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getReturndate();
	returndate = returndate.substring(0, returndate.indexOf("T"));
	String returntime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getReturntime();
	returntime = returntime.substring(returntime.indexOf("T"), (returntime.indexOf(":") + 3));
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
