package com.cts.product.rental.mapper;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.CollectionUtils;

import com.cts.product.aiagent.dto.Parameters;
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
    static final Logger LOG = LoggerFactory.getLogger(ReservationMapper.class);

    public static InitiateReservationRequest mapInitiateRequest(RentalRequest initiateAIRequest) {
	Parameters params = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters();
	String pickupdate = params.getDate();
	pickupdate = pickupdate.substring(0, pickupdate.indexOf("T"));
	String pickuptime = params.getTime();
	pickuptime = pickuptime.substring(pickuptime.indexOf("T"), (pickuptime.indexOf(":") + 3));
	String pickupDateTime = pickupdate + pickuptime;
	DateTime pikupDate = new DateTime(pickupDateTime);
	int durationAmount = params.getDuration().getAmount();
	String durationUnit = params.getDuration().getUnit();
	int durationInDays = 0;
	if (StringUtils.equalsIgnoreCase("h", durationUnit)) {
	    durationInDays = 1;
	} else if (StringUtils.equalsIgnoreCase("day", durationUnit)) {
	    durationInDays = durationAmount;
	} else if (StringUtils.equalsIgnoreCase("wk", durationUnit)) {
	    durationInDays = durationAmount * 7;
	} else if (StringUtils.equalsIgnoreCase("mo", durationUnit)) {
	    durationInDays = durationAmount * 30;
	}
	DateTime rtrnDate = pikupDate.plusDays(durationInDays);
	DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd'T'HH:mm");
	String returnDateTime = dtf.print(rtrnDate);
	pickupDateTime = dtf.print(pikupDate);
	String pickupLocationId = params.getBranchCode();
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
	if (CollectionUtils.isEmpty(reservationResponse.getMessages())) {
		LOG.debug("reservationResponse.getMessages() is blank");
		rentalResponse.setFulfillmentText("Success");
	    carClasses.addAll(reservationResponse.getCarClasses());
	} else {
	    reservationResponse.getMessages().stream().forEach(em -> {
		LOG.error("ERROR :: " + em.getPriority() + " | " + em.getCode() + " | " + em.getMessage());
	    });
	}
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
	if (CollectionUtils.isEmpty(reservationResponse.getMessages())) {
	    rentalResponse.setFulfillmentText("Success");
	} else {
	    reservationResponse.getMessages().stream().forEach(em -> {
		LOG.error("ERROR :: " + em.getPriority() + " | " + em.getCode() + " | " + em.getMessage());
	    });
	}
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
	Parameters p = initiateAIRequest.getQueryResult().getOutputContexts().get(0).getParameters();
	driverInfo.setFirstName(p.getFirstName());
	driverInfo.setLastName(p.getLastName());
	// driverInfo.setFirstName("Jane");// hard coded
	// driverInfo.setLastName("Smith");// hard coded
	String email = p.getFirstName() + p.getLastName() + "@mailinator.com";
	driverInfo.setEmailAddress(email); // hard coded
	Phone phone = new Phone();
	phone.setPhoneNumber("3145125555");// hard coded
	phone.setPhoneType(PhoneTypeEnum.HOME);// hard coded
	driverInfo.setPhone(phone);
	commitReservationRequest.setDriverInfo(driverInfo);
	return commitReservationRequest;
    }

    public static RentalResponse mapCommitResponse(ReservationResponse reservationResponse) {
	RentalResponse rentalResponse = new RentalResponse();
	if (CollectionUtils.isEmpty(reservationResponse.getMessages())) {
	    rentalResponse.setFulfillmentText(!CollectionUtils.isEmpty(reservationResponse.getMessages())
		    ? reservationResponse.getMessages().get(0).getMessage()
		    : "Your reservation number is " + reservationResponse.getConfirmationNumber()
			    + ". Thank you for choosing Enterprise car rental. Have a great day.");
	} else {
	    reservationResponse.getMessages().stream().forEach(em -> {
		LOG.error("ERROR :: " + em.getPriority() + " | " + em.getCode() + " | " + em.getMessage());
	    });
	}
	return rentalResponse;
    }
}
