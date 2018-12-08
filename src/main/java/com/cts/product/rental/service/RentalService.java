package com.cts.product.rental.service;

import org.springframework.http.HttpHeaders;

import com.cts.product.rental.dto.messages.CommitReservationRequest;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.rental.dto.messages.VehicleDetailsRequest;

public interface RentalService {

    ReservationResponse initiate(InitiateReservationRequest initiateReservationRequest, String brand, String channel,
	    HttpHeaders httpHeaders) throws Exception;

    ReservationResponse selectCarClass(VehicleDetailsRequest vehicleDetailsRequest, String brand, String channel,
	    String resSessionId, HttpHeaders httpHeaders) throws Exception;

    ReservationResponse commit(CommitReservationRequest commitReservationRequest, String brand, String channel,
	    String resSessionId, HttpHeaders httpHeaders) throws Exception;

}
