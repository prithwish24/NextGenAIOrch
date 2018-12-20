package com.cts.product.rental.delegate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.aiagent.dto.OutputContext;
import com.cts.product.aiagent.dto.Parameters;
import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;
import com.cts.product.rental.dto.messages.CommitReservationRequest;
import com.cts.product.rental.dto.messages.InitiateReservationRequest;
import com.cts.product.rental.dto.messages.Request;
import com.cts.product.rental.dto.messages.ReservationResponse;
import com.cts.product.rental.dto.messages.Response;
import com.cts.product.rental.dto.messages.VehicleDetailsRequest;
import com.cts.product.rental.dto.reservation.CarClass;
import com.cts.product.rental.mapper.ReservationMapper;
import com.cts.product.rental.service.RentalService;

@Service
public class ReservationServiceDelegate {
    private static final Logger LOG = LoggerFactory.getLogger(ReservationServiceDelegate.class);

    private static final String CARRENTAL = "carrental";

    @Autowired
    private RentalService<Request, Response> reservationService;

    @Value(value = "${rental.baseUrl}${rental.initiateUrl}")
    private String initiateUrl;
    @Value(value = "${rental.baseUrl}${rental.selectCarClassUrl}")
    private String selectCarClassUrl;
    @Value(value = "${rental.baseUrl}${rental.commitUrl}")
    private String commitUrl;

    private List<CarClass> carClasses = new ArrayList<CarClass>();

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

	Parameters p = getCarRentalParams(reservationRequest);

	switch (action) {
	case "initiateReservation":
	    carClasses.clear();
	    InitiateReservationRequest initiateReservationRequest = ReservationMapper.mapInitiateRequest(p);
	    reservationResponse = reservationService.sendRequest(initiateReservationRequest, reservationResponse, brand,
		    channel, reservationRequest.getSession(), initiateUrl, headers);
	    rentalResponse = ReservationMapper.mapInitiateResponse(reservationResponse, carClasses);
	    carClasses.stream().forEach(cc -> LOG.debug(cc.getCode() + " - " + cc.getName() + " - " + cc.getStatus()));
	    break;
	case "selectCarClass":
	    String prefCarclass = p.getCarclass();
	    CarClass carclass = carClasses.stream()
		    .filter(carCls -> StringUtils.equalsIgnoreCase(prefCarclass, carCls.getCode())).findAny()
		    .orElse(null);
	    if (carclass != null) {
		p.setCarclass(carclass.getCode());
		VehicleDetailsRequest vehicleDetailsRequest = ReservationMapper.mapSelectCarClassRequest(p);
		reservationResponse = reservationService.sendRequest(vehicleDetailsRequest, reservationResponse, brand,
			channel, reservationRequest.getSession(), selectCarClassUrl, headers);
		rentalResponse = ReservationMapper.mapSelectCarClassResponse(reservationResponse);
	    } else {
		rentalResponse = ReservationMapper.mapNoCarClassResponse();
	    }
	    break;
	case "commitReservation":
	    CommitReservationRequest commitReservationRequest = ReservationMapper.mapCommitRequest(p);
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

    private Parameters getCarRentalParams(final RentalRequest request) {
	OutputContext oc = request.getQueryResult().getOutputContexts().stream()
		.filter(c -> c.getName().endsWith(CARRENTAL)).findFirst().orElse(null);
	if (oc != null) {
	    return oc.getParameters();
	}
	return null;
    }
}
