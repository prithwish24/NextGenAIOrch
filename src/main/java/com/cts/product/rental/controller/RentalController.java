package com.cts.product.rental.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.rental.dto.ai.ReservationRequest;
import com.cts.product.rental.dto.ai.ReservationResponse;
import com.cts.product.rental.service.RentalService;

@RestController
@RequestMapping(value = "/rental/{brand}/{channel}")
public class RentalController {

    private static final Logger LOG = LoggerFactory.getLogger(RentalController.class);

    @Autowired
    private RentalService rentalService;

    @RequestMapping(value = "/initiate", method = RequestMethod.POST)
    public ReservationResponse initiateReservation(@Valid @RequestBody ReservationRequest initiateReservationRequest,
	    HttpServletRequest request, @PathVariable("brand") String brand, @PathVariable("channel") String channel) {
	rentalService.initiate(initiateReservationRequest, brand, channel);
	return new ReservationResponse();
    }

}
