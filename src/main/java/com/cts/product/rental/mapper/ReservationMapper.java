package com.cts.product.rental.mapper;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

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
	String pickupDateTime = pickupdate + pickuptime;
	DateTime pikupDate = new DateTime(pickupDateTime);
	Integer duration = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getDuration();
	DateTime rtrnDate = pikupDate.plusDays(duration);
	DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm");
	String returnDateTime = dtf.print(rtrnDate);
	pickupDateTime = dtf.print(pikupDate);
	String pickupLocation = "STLT61";
	String returnLocation = pickupLocation;
	InitiateReservationRequest initiateReservationRequest = new InitiateReservationRequest();
	initiateReservationRequest.setPickupLocationId(pickupLocation);
	initiateReservationRequest.setReturnLocationId(returnLocation);
	initiateReservationRequest.setPickupTime(pickupDateTime);
	initiateReservationRequest.setReturnTime(returnDateTime);
	return initiateReservationRequest;
    }

    public static RentalResponse mapResponse(ReservationResponse reservationResponse) {

	return null;
    }
}
