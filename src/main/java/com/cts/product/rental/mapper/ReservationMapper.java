package com.cts.product.rental.mapper;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.util.CollectionUtils;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.common.Phone;
import com.cts.product.rental.dto.common.enums.PhoneTypeEnum;
import com.cts.product.rental.dto.messages.CommitReservationRequest;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.rental.dto.messages.VehicleDetailsRequest;
import com.cts.product.rental.dto.reservation.CarClass;
import com.cts.product.rental.dto.reservation.DriverInfo;

public class ReservationMapper {

    public static InitiateReservationRequest mapInitiateRequest(RentalRequest initiateAIRequest) {
	String pickupdate = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getDate();
	pickupdate = pickupdate.substring(0, pickupdate.indexOf("T"));
	String pickuptime = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getTime();
	pickuptime = pickuptime.substring(pickuptime.indexOf("T"), (pickuptime.indexOf(":") + 3));
	String pickupDateTime = pickupdate + pickuptime;
	DateTime pikupDate = new DateTime(pickupDateTime);
	int durationAmount = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getDuration()
		.getAmount();
	String durationUnit = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getDuration().getUnit();
	int durationInDays = 0;
	if (StringUtils.equalsIgnoreCase("hour", durationUnit)) {
	    durationInDays = 1;
	} else if (StringUtils.equalsIgnoreCase("day", durationUnit)) {
	    durationInDays = durationAmount;
	} else if (StringUtils.equalsIgnoreCase("week", durationUnit)) {
	    durationInDays = durationAmount * 7;
	} else if (StringUtils.equalsIgnoreCase("month", durationUnit)) {
	    durationInDays = durationAmount * 30;
	}
	DateTime rtrnDate = pikupDate.plusDays(durationInDays);
	DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm");
	String returnDateTime = dtf.print(rtrnDate);
	pickupDateTime = dtf.print(pikupDate);
	String pickupLocationId = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters()
		.getBranchCode();
	pickupLocationId = "STLT61";// hard coded
	String returnLocationId = pickupLocationId;
	InitiateReservationRequest initiateReservationRequest = new InitiateReservationRequest();
	initiateReservationRequest.setPickupLocationId(pickupLocationId);
	initiateReservationRequest.setReturnLocationId(returnLocationId);
	initiateReservationRequest.setPickupTime(pickupDateTime);
	initiateReservationRequest.setReturnTime(returnDateTime);
	return initiateReservationRequest;
    }

    public static RentalResponse mapInitiateResponse(ReservationResponse reservationResponse,
	    List<CarClass> carClasses) {
	RentalResponse rentalResponse = new RentalResponse();
	rentalResponse.setSession(reservationResponse.getResSessionId());
	rentalResponse.setFulfillmentText(!CollectionUtils.isEmpty(reservationResponse.getMessages())
		? reservationResponse.getMessages().get(0).getMessage()
		: "Success");
	carClasses.addAll(reservationResponse.getCarClasses());
	return rentalResponse;
    }

    public static VehicleDetailsRequest mapSelectCarClassRequest(RentalRequest initiateAIRequest) {
	VehicleDetailsRequest vehicleDetailsRequest = new VehicleDetailsRequest();
	vehicleDetailsRequest.setCarClassCode(
		initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getCarclass());
	return vehicleDetailsRequest;
    }

    public static RentalResponse mapSelectCarClassResponse(ReservationResponse reservationResponse) {
	RentalResponse rentalResponse = new RentalResponse();
	rentalResponse.setSession(reservationResponse.getResSessionId());
	rentalResponse.setFulfillmentText(!CollectionUtils.isEmpty(reservationResponse.getMessages())
		? reservationResponse.getMessages().get(0).getMessage()
		: "Success");
	return rentalResponse;
    }

    public static RentalResponse mapNoCarClassResponse() {
	RentalResponse rentalResponse = new RentalResponse();
	rentalResponse.setFulfillmentText(
		"Sorry. Requested car class is not available right now. Please try another car type like economy, compact, intermediate, standard, mid size, full size or premium.");
	return rentalResponse;
    }

    public static CommitReservationRequest mapCommitRequest(RentalRequest initiateAIRequest) {
	CommitReservationRequest commitReservationRequest = new CommitReservationRequest();
	DriverInfo driverInfo = new DriverInfo();
	driverInfo.setFirstName(
		initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getFirstName());
	driverInfo.setLastName(
		initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters().getLastName());
	driverInfo.setFirstName("Jane");// hard coded
	driverInfo.setLastName("Smith");// hard coded
	driverInfo.setEmailAddress("testemail@testemailsoapuicros.com");// hard coded
	Phone phone = new Phone();
	phone.setPhoneNumber("3334445555");// hard coded
	phone.setPhoneType(PhoneTypeEnum.HOME);// hard coded
	driverInfo.setPhone(phone);
	commitReservationRequest.setDriverInfo(driverInfo);
	return commitReservationRequest;
    }

    public static RentalResponse mapCommitResponse(ReservationResponse reservationResponse) {
	RentalResponse rentalResponse = new RentalResponse();
	rentalResponse.setFulfillmentText(!CollectionUtils.isEmpty(reservationResponse.getMessages())
		? reservationResponse.getMessages().get(0).getMessage()
		: "Your reservation number is " + reservationResponse.getConfirmationNumber()
			+ ". Thank you for choosing Enterprise car rental. Have a great day.");
	return rentalResponse;
    }
}
