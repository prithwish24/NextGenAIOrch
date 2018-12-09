package com.cts.product.rental.service;

import org.springframework.http.HttpHeaders;

public interface RentalService<T, S> {

    <S> S sendRequest(T request, S response, String brand, String channel, String resSessionId, String url,
	    HttpHeaders httpHeaders) throws Exception;

}
