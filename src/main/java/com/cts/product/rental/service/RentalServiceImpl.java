package com.cts.product.rental.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.util.ErrorBuilder;
import com.cts.product.util.HeaderBuilder;
import com.cts.product.util.RestTemplateBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RentalServiceImpl implements RentalService {

    @Value(value = "${rental.baseUrl}${rental.initiateUrl}")
    private String initiateUrl;

    @Override
    public ReservationResponse initiate(InitiateReservationRequest initiateReservationRequest, String brand,
	    String channel, HttpHeaders httpHeaders) throws Exception {

	ReservationResponse rentalResponse = null;
	RestTemplate restTemplate = RestTemplateBuilder.getRestTemplate();
	HttpHeaders headers = HeaderBuilder.createHeaders(httpHeaders.toSingleValueMap());

	HttpEntity<InitiateReservationRequest> entity = new HttpEntity<InitiateReservationRequest>(
		initiateReservationRequest, headers);
	ResponseEntity<ReservationResponse> result = null;
	try {
	    result = restTemplate.exchange(initiateUrl, HttpMethod.POST, entity, ReservationResponse.class, brand,
		    channel);
	    rentalResponse = result.getBody();
	} catch (HttpStatusCodeException e) {
	    ObjectMapper objectMapper = RestTemplateBuilder.getObjectMapper();
	    rentalResponse = objectMapper.readValue(e.getResponseBodyAsString(), ReservationResponse.class);
	} catch (Exception e) {
	    return ErrorBuilder.getRentalError();
	}
	return rentalResponse;
    }

}
