package com.cts.product.profile.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.service.ProfileService;
import com.cts.product.profile.service.SessionService;

@Service
public class ProfileServiceDelegate {

    @Autowired
    private ProfileService profileService;
    @Autowired
    private SessionService sessionService;

    // @HystrixCommand(fallbackMethod = "authenticate_fallback")
    public UserProfile authenticate(String username, String password) {
	return profileService.authenticate(username, password);
    }

    public UserProfile getUserProfile(String userId) {
	return profileService.getUserProfile(userId);
    }

    public String createSession(String userId) {
	return sessionService.createSession(userId);
    }

    public void logout(String userId) {
	sessionService.removeSession(userId);
    }

    public ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty,
	    HttpHeaders headers) {
	return profileService.login(loginRequest, brand, channel, loyalty, headers);
    }

    public UserProfile authenticate_fallback(String username, String password) {
	return null;
    }

}
