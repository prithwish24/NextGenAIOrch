package com.cts.product.profile.service;

import org.springframework.http.HttpHeaders;

import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;

public interface ProfileService {
    UserProfile authenticate(String username, String password);

    UserProfile getUserProfile(String userId);

    ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty, HttpHeaders headers);
}
