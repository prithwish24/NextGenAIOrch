package com.cts.product.rental.service;

import com.cts.product.rental.dto.ai.ReservationRequest;
import com.cts.product.rental.dto.ai.ReservationResponse;

public interface RentalService {

    ReservationResponse initiate(ReservationRequest initiateReservationRequest, String brand, String channel);

}
