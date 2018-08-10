package com.cts.product.profile.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.util.ErrorBuilder;
import com.cts.product.util.HeaderBuilder;
import com.cts.product.util.RestTemplateBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Value(value = "${profile.baseUrl}${profile.loginUrl}")
    private String loginUrl;

    @Override
    public ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty,
	    HttpHeaders httpHeaders) throws Exception {
	RestTemplate restTemplate = RestTemplateBuilder.getRestTemplate();
	HttpHeaders headers = HeaderBuilder.createHeaders(httpHeaders.toSingleValueMap());

	HttpEntity<LoginRequest> entity = new HttpEntity<LoginRequest>(loginRequest, headers);
	ResponseEntity<ProfileResponse> result = null;
	try {
	    result = restTemplate.exchange(loginUrl, HttpMethod.POST, entity, ProfileResponse.class, brand, channel,
		    loyalty);
	} catch (HttpStatusCodeException e) {
	    ObjectMapper objectMapper = RestTemplateBuilder.getObjectMapper();
	    ProfileResponse profileResponse = objectMapper.readValue(e.getResponseBodyAsString(),
		    ProfileResponse.class);
	    return profileResponse;
	} catch (Exception e) {
	    return ErrorBuilder.getProfileError();
	}
	return result.getBody();
    }
}
