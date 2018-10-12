package com.cts.product.profile.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.profile.domain.BaseResponse;
import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.dto.profiles.EnrichedMessage;
import com.cts.product.profile.mapper.ProfileResponseMapper;
import com.cts.product.profile.service.ProfileService;

@RestController()
@RequestMapping(value = "/services/profile/{brand}/{channel}")
public class ProfileController {

    private static final Logger LOG = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/{loyalty}/login", method = RequestMethod.POST)
    public BaseResponse<UserProfile> login(@RequestBody LoginRequest loginRequest, @PathVariable("brand") String brand,
	    @PathVariable("channel") String channel, @PathVariable("loyalty") String loyalty,
	    HttpServletRequest request, @RequestHeader HttpHeaders headers) throws Exception {
	LOG.info("Entering login service");

	ProfileResponse response = null;
	BaseResponse<UserProfile> bp = new BaseResponse<UserProfile>();
	if (StringUtils.isEmpty(loginRequest.getUsername())) {
	    bp.setServiceError("2001", "ERROR", "Username is required");
	}

	if (StringUtils.isEmpty(loginRequest.getPassword())) {
	    bp.setServiceError("2002", "ERROR", "Password is required");
	}
	response = profileService.login(loginRequest, brand, channel, loyalty, headers);
	List<EnrichedMessage> messages = response.getMessages();
	if (CollectionUtils.isEmpty(messages)) {
	    bp.setSuccess(true);
	    bp.setResponse(ProfileResponseMapper.mapUserProfile(response));
	} else {
	    for (EnrichedMessage message : messages) {
		if (StringUtils.equals("ERROR", message.getPriority())) {
		    bp.setServiceError(message.getCode(), message.getPriority(), message.getMessage());
		}
	    }
	}
	LOG.info("Exisiting from login service");
	return bp;
    }

}
