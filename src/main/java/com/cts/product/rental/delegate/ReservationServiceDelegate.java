package com.cts.product.rental.delegate;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.CommitReservationRequest;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.Request;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.rental.dto.messages.Response;
import com.cts.product.rental.dto.messages.VehicleDetailsRequest;
import com.cts.product.rental.mapper.ReservationMapper;
import com.cts.product.rental.service.RentalService;

@Service
public class ReservationServiceDelegate {
    private static final Logger LOG = LoggerFactory.getLogger(ReservationServiceDelegate.class);

    @Autowired
    private RentalService<Request, Response> reservationService;

    @Value(value = "${rental.baseUrl}${rental.initiateUrl}")
    private String initiateUrl;
    @Value(value = "${rental.baseUrl}${rental.selectCarClassUrl}")
    private String selectCarClassUrl;
    @Value(value = "${rental.baseUrl}${rental.commitUrl}")
    private String commitUrl;

    public RentalResponse delegate(RentalRequest reservationRequest, String brand, String channel, HttpHeaders headers)
	    throws Exception {
	RentalResponse rentalResponse = new RentalResponse();
	String action = "";
	ReservationResponse reservationResponse = new ReservationResponse();
	if (reservationRequest.getQueryResult() != null && reservationRequest.getQueryResult().getAction() != null) {
	    action = reservationRequest.getQueryResult().getAction().trim();
	    LOG.debug("action : " + action);
	} else {
	    LOG.debug("action is empty : " + action.isEmpty());
	}

	switch (action) {
	case "initiateReservation":
	    InitiateReservationRequest initiateReservationRequest = ReservationMapper
		    .mapInitiateRequest(reservationRequest);
	    reservationResponse = reservationService.sendRequest(initiateReservationRequest, reservationResponse, brand,
		    channel, reservationRequest.getSession(), initiateUrl, headers);
	    rentalResponse = ReservationMapper.mapInitiateResponse(reservationResponse);
	    break;
	case "selectCarClass":
	    VehicleDetailsRequest vehicleDetailsRequest = ReservationMapper
		    .mapSelectCarClassRequest(reservationRequest);
	    reservationResponse = reservationService.sendRequest(vehicleDetailsRequest, reservationResponse, brand,
		    channel, reservationRequest.getSession(), selectCarClassUrl, headers);
	    rentalResponse = ReservationMapper.mapSelectCarClassResponse(reservationResponse);
	    break;
	case "commitReservation":
	    CommitReservationRequest commitReservationRequest = ReservationMapper.mapCommitRequest(reservationRequest);
	    reservationResponse = reservationService.sendRequest(commitReservationRequest, reservationResponse, brand,
		    channel, reservationRequest.getSession(), commitUrl, headers);
	    rentalResponse = ReservationMapper.mapCommitResponse(reservationResponse);
	    break;
	default:
	    throw new IOException("Undefined action (" + action + ")");
	}

	LOG.debug("response: " + rentalResponse);
	return rentalResponse;
    }
}
