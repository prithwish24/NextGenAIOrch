package com.cts.product.util;

import java.util.ArrayList;
import java.util.List;

import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.dto.profiles.EnrichedMessage;

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
}
