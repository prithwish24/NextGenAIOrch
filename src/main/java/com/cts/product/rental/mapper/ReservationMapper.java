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

    public static InitiateReservationRequest mapInitiateRequest (final Parameters params) {
	//Parameters params = parameters.getQueryResult().getOutputContexts().get(0).getParameters();
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
	    rentalResponse.setFulfillmentText("Success");
	    carClasses.addAll(reservationResponse.getCarClasses());
	} else {
	    reservationResponse.getMessages().stream().forEach(em -> {
		LOG.error("ERROR :: " + em.getPriority() + " | " + em.getCode() + " | " + em.getMessage());
	    });
	}
	return rentalResponse;
    }

    public static VehicleDetailsRequest mapSelectCarClassRequest(final Parameters params) {
	VehicleDetailsRequest vehicleDetailsRequest = new VehicleDetailsRequest();
	vehicleDetailsRequest.setCarClassCode(params.getCarclass());
	return vehicleDetailsRequest;
    }

    public static RentalResponse mapSelectCarClassResponse(ReservationResponse reservationResponse) {
    	RentalResponse rentalResponse = new RentalResponse();
    	rentalResponse.setSession(reservationResponse.getResSessionId());
    	if (CollectionUtils.isEmpty(reservationResponse.getMessages())) {
    		rentalResponse.setFulfillmentText("Okey. Your total charge is "
    				+ reservationResponse.getCarClassDetails().getVehicleRates().get(0).getPriceSummary()
    				.getTotalCharged()
    				+ " " + reservationResponse.getCarClassDetails().getVehicleRates().get(0).getPriceSummary()
    				.getEstimatedTotalView().getCode()+". Can I get your name please?");
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

    public static CommitReservationRequest mapCommitRequest(final Parameters params) {
    	CommitReservationRequest commitReservationRequest = new CommitReservationRequest();
    	String driverFirstName = "Guest", driverLastName = " ";
    	if (params.getFirstName() != null && params.getLastName() != null) {
    		driverFirstName = params.getFirstName().getGivenName()!=null?params.getFirstName().getGivenName():" ";
    		driverLastName = params.getLastName().getLastName()!=null?params.getLastName().getLastName():" ";

    	} else if (StringUtils.isNotBlank(params.getFullName())) {
    		String[] split = params.getFullName().split(" ");
    		if (split.length > 1) {
    			driverLastName = split[split.length-1];
    			driverFirstName = StringUtils.join(split, " ", 0, split.length-2);
    		} else {
    			driverFirstName = params.getFullName();
    		}
    	}
    	DriverInfo driverInfo = new DriverInfo();
    	driverInfo.setFirstName(driverFirstName);
    	driverInfo.setLastName(driverLastName);
    	String email = driverFirstName+"."+driverLastName + "@mailinator.com";
    	driverInfo.setEmailAddress(email); // hard coded
    	Phone phone = new Phone();
    	phone.setPhoneNumber(params.getPhoneNumber());
    	phone.setPhoneType(PhoneTypeEnum.HOME); 
    	driverInfo.setPhone(phone);
    	commitReservationRequest.setDriverInfo(driverInfo);
    	return commitReservationRequest;
    }

    public static RentalResponse mapCommitResponse(ReservationResponse reservationResponse) {
	RentalResponse rentalResponse = new RentalResponse();
	if (CollectionUtils.isEmpty(reservationResponse.getMessages())) {
	    rentalResponse.setConfNumber(reservationResponse.getConfirmationNumber()); // this will be high priority
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
