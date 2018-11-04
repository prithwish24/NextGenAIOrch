package com.cts.product.rental.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.rental.delegate.ReservationServiceDelegate;
import com.cts.product.rental.dto.ai.RentalRequest;
import com.cts.product.rental.dto.ai.RentalResponse;

@RestController
@RequestMapping(value = "/services/rental/{brand}/{channel}")
public class RentalController {

	private static final Logger LOG = LoggerFactory.getLogger(RentalController.class);

	@Autowired
	private ReservationServiceDelegate reservationServiceDelegate;

	@RequestMapping(value = "/initiate", method = RequestMethod.POST)
	public RentalResponse initiateReservation(
			HttpServletRequest request, 
			@Valid @RequestBody RentalRequest initiateResReq,
			@PathVariable("brand") String brand, 
			@PathVariable("channel") String channel,
			@RequestHeader HttpHeaders headers) throws Exception {
		LOG.info("Entering initiateReservation service");

		RentalResponse response = null;
		try {
			response = reservationServiceDelegate.delegate(initiateResReq, brand, channel, headers);
		} catch (Exception e) {
			throw e;
		}

		LOG.info("Exiting from initiateReservation service");
		return response;
	}

}
