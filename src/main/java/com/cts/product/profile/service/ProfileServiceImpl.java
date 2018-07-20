package com.cts.product.profile.service;

import java.io.IOException;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class ProfileServiceImpl implements ProfileService {

    @Override
    public UserProfile authenticate(String username, String password) {
	List<UserProfile> userProfileList = getAllUsers();
	UserProfile profile = null;
	for (UserProfile userProfile : userProfileList)
	    if (userProfile.getUsername().equalsIgnoreCase(username) && userProfile.getPassword().equals(password)) {
		profile = userProfile;
		break;
	    }

	return profile;
    }

    @Override
    public UserProfile getUserProfile(String userId) {
	List<UserProfile> userProfileList = getAllUsers();
	UserProfile profile = null;
	for (UserProfile userProfile : userProfileList) {
	    if (userProfile.getUsername().equals(userId)) {
		profile = userProfile;
		break;
	    }
	}
	return profile;
    }

    public List<UserProfile> getAllUsers() {
	ObjectMapper mapper = new ObjectMapper();
	TypeReference<List<UserProfile>> typeReference = new TypeReference<List<UserProfile>>() {

	};
	List<UserProfile> userProfileList = null;
	try {
	    userProfileList = mapper.readValue(new ClassPathResource("data.json").getInputStream(), typeReference);
	} catch (JsonParseException e) {
	    e.printStackTrace();
	} catch (JsonMappingException e) {
	    e.printStackTrace();
	} catch (IOException e) {
	    e.printStackTrace();
	}
	return userProfileList;
    }

    @Override
    public ProfileResponse login(LoginRequest loginRequest, String brand, String channel, String loyalty) {
	final String uri = "https://www-gbo-profile-rcqa.gbo.csdev.ehiaws-nonprod.com/gbo-profile/api/v2/profiles/"
		+ brand + "/" + channel + "/" + loyalty + "/login";
	RestTemplate restTemplate = new RestTemplate();
	HttpHeaders headers = new HttpHeaders();
	headers.set("CORRELATION_ID", "_Login");
	headers.set("Accept-Language", "en_US");
	headers.set("country-of-residence-code", "US");
	headers.set("Ehi-API-Key", "OOEuCONvdswAtjr/86KwIuxiSP7Z0Tknd98mU02FIQQ=");
	headers.set("Content-Type", "application/json; charset=UTF-8");

	HttpEntity<LoginRequest> entity = new HttpEntity<LoginRequest>(loginRequest, headers);

	ResponseEntity<ProfileResponse> result = restTemplate.exchange(uri, HttpMethod.POST, entity,
		ProfileResponse.class);
	return result.getBody();
    }
}
