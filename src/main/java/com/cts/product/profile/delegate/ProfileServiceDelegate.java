package com.cts.product.profile.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.service.ProfileService;

@Service
public class ProfileServiceDelegate {

    @Autowired
    private ProfileService profileService;

    public ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty,
	    HttpHeaders headers) throws Exception {
	return profileService.login(loginRequest, brand, channel, loyalty, headers);
    }

}
