package com.cts.product.util;

import java.util.ArrayList;
import java.util.List;

import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.dto.profiles.EnrichedMessage;
import com.cts.product.rental.dto.messages.ReservationResponse;

public class ErrorBuilder {

    public static ProfileResponse getProfileError() {
	ProfileResponse profileResponse = new ProfileResponse();
	List<EnrichedMessage> messages = new ArrayList<EnrichedMessage>();
	EnrichedMessage enrichedMessage = new EnrichedMessage();
	enrichedMessage.setCode("INTERNAL_SERVER_ERROR");
	enrichedMessage.setMessage("INTERNAL SERVER ERROR");
	enrichedMessage.setPriority("ERROR");
	enrichedMessage.setLocale("en_US");
	messages.add(enrichedMessage);
	profileResponse.getMessages().addAll(messages);
	return profileResponse;
    }

    public static ReservationResponse getRentalError() {
	ReservationResponse reservationResponse = new ReservationResponse();
	List<com.cts.product.rental.dto.common.EnrichedMessage> messages = new ArrayList<com.cts.product.rental.dto.common.EnrichedMessage>();
	com.cts.product.rental.dto.common.EnrichedMessage enrichedMessage = new com.cts.product.rental.dto.common.EnrichedMessage();
	enrichedMessage.setCode("INTERNAL_SERVER_ERROR");
	enrichedMessage.setMessage("INTERNAL SERVER ERROR");
	enrichedMessage.setPriority("ERROR");
	enrichedMessage.setLocale("en_US");
	messages.add(enrichedMessage);
	reservationResponse.getMessages().addAll(messages);
	return reservationResponse;
    }
}
