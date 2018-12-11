package com.cts.product.rental.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	static final Logger LOG = LoggerFactory.getLogger(RentalServiceImpl.class);
	
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
	    response = (S) result.getBody();
	} catch (HttpStatusCodeException e) {
		LOG.error(e.getMessage(), e);
	    ObjectMapper objectMapper = RestTemplateBuilder.getObjectMapper();
	    response = (S) objectMapper.readValue(e.getResponseBodyAsString(), response.getClass());
	} catch (Exception e) {
		LOG.error(e.getMessage(), e);
		return (S) ErrorBuilder.getRentalError();
	}
	return response;
    }

}
