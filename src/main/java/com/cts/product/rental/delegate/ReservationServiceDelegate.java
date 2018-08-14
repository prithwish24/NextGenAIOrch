package com.cts.product.rental.delegate;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.rental.mapper.ReservationRequestMapper;
import com.cts.product.rental.service.RentalService;

@Service
public class ReservationServiceDelegate {
    private static final Logger LOG = LoggerFactory.getLogger(ReservationServiceDelegate.class);

    @Autowired
    private RentalService reservationService;

    public RentalResponse delegate(RentalRequest reservationRequest, String brand, String channel, HttpHeaders headers)
	    throws Exception {
	RentalResponse rentalResponse = new RentalResponse();
	String action = reservationRequest.getQueryResult().getAction() == null ? ""
		: reservationRequest.getQueryResult().getAction().trim();
	LOG.debug("action: " + action);

	switch (action) {
	case "initiateReservation":
	    InitiateReservationRequest initiateReservationRequest = ReservationRequestMapper
		    .mapRequest(reservationRequest);
	    ReservationResponse reservationResponse = reservationService.initiate(initiateReservationRequest, brand,
		    channel, headers);
	    rentalResponse = ReservationRequestMapper.mapResponse(reservationResponse);
	    break;
	default:
	    throw new IOException("Undefined action (" + action + ")");
	}

	LOG.debug("response: " + rentalResponse);
	return rentalResponse;
    }
}
