package com.cts.product.rental.service;

import org.springframework.http.HttpHeaders;

import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;

public interface RentalService {

    ReservationResponse initiate(InitiateReservationRequest initiateReservationRequest, String brand, String channel,
	    HttpHeaders httpHeaders) throws Exception;

}
