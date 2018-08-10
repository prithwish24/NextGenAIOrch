package com.cts.product.profile.service;

import org.springframework.http.HttpHeaders;

import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;

public interface ProfileService {

    ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty, HttpHeaders headers)
	    throws Exception;
}
