package com.cts.product.rental.service;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;
import org.springframework.web.client.RestTemplate;

import com.cts.product.util.ErrorBuilder;
import com.cts.product.util.HeaderBuilder;
import com.cts.product.util.RestTemplateBuilder;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class RentalServiceImpl<T, S> implements RentalService<T, S> {

    @Override
    public <S> S sendRequest(T request, S response, String brand, String channel, String resSessionId, String url,
	    HttpHeaders httpHeaders) throws Exception {

	RestTemplate restTemplate = RestTemplateBuilder.getRestTemplate();
	HttpHeaders headers = HeaderBuilder.createHeaders(httpHeaders.toSingleValueMap());

	HttpEntity<T> entity = new HttpEntity<T>(request, headers);
	ResponseEntity<S> result = null;
	try {
	    result = (ResponseEntity<S>) restTemplate.exchange(url, HttpMethod.POST, entity, response.getClass(), brand,
		    channel, resSessionId);
	    System.out.println("--------------->>>>>>>> \n"+ (result != null?result.getBody():null));
	    response = (S) result.getBody();
	} catch (HttpStatusCodeException e) {
		System.err.println("error ffrom service 1");
		e.printStackTrace();
	    ObjectMapper objectMapper = RestTemplateBuilder.getObjectMapper();
	    response = (S) objectMapper.readValue(e.getResponseBodyAsString(), response.getClass());
	} catch (Exception e) {
		System.err.println("error ffrom service 2");
		e.printStackTrace();
		return (S) ErrorBuilder.getRentalError();
	}
	return response;
    }

}
