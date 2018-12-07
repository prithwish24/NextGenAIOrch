package com.cts.product.rental.mapper;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.CollectionUtils;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;

public class ReservationMapper {
    public static InitiateReservationRequest mapRequest(RentalRequest initiateAIRequest) {
	String pickupdate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getDate();
	pickupdate = pickupdate.substring(0, pickupdate.indexOf("T"));
	String pickuptime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getTime();
	pickuptime = pickuptime.substring(pickuptime.indexOf("T"), (pickuptime.indexOf(":") + 3));
	String pickupDateTime = pickupdate + pickuptime;
	DateTime pikupDate = new DateTime(pickupDateTime);
	Integer duration = Integer
		.parseInt(initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getDuration());
	DateTime rtrnDate = pikupDate.plusDays(duration);
	DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm");
	String returnDateTime = dtf.print(rtrnDate);
	pickupDateTime = dtf.print(pikupDate);
	String pickupLocationId = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getBranchCode();
	String returnLocationId = pickupLocationId;
	InitiateReservationRequest initiateReservationRequest = new InitiateReservationRequest();
	initiateReservationRequest.setPickupLocationId(pickupLocationId);
	initiateReservationRequest.setReturnLocationId(returnLocationId);
	initiateReservationRequest.setPickupTime(pickupDateTime);
	initiateReservationRequest.setReturnTime(returnDateTime);
	return initiateReservationRequest;
    }

    public static RentalResponse mapResponse(ReservationResponse reservationResponse) {
	RentalResponse rentalResponse = new RentalResponse();
	rentalResponse.setFulfillmentText(!CollectionUtils.isEmpty(reservationResponse.getMessages())
		? reservationResponse.getMessages().get(0).getMessage()
		: "Success");
	return rentalResponse;
    }
}
