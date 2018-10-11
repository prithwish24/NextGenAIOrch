package com.cts.product.profile.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.profile.domain.BaseResponse;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;
import com.cts.product.profile.service.ProfileService;

@RestController()
@RequestMapping(value = "/services/profile/{brand}/{channel}")
public class ProfileController {

    private static final Logger LOG = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private ProfileService profileService;

    @RequestMapping(value = "/{loyalty}/login", method = RequestMethod.POST)
    public BaseResponse<ProfileResponse> login(@RequestBody LoginRequest loginRequest,
	    @PathVariable("brand") String brand, @PathVariable("channel") String channel,
	    @PathVariable("loyalty") String loyalty, HttpServletRequest request, @RequestHeader HttpHeaders headers)
	    throws Exception {
	LOG.info("Entering login service");

	ProfileResponse response = null;
	BaseResponse<ProfileResponse> bp = new BaseResponse<ProfileResponse>();
	try {
	    response = profileService.login(loginRequest, brand, channel, loyalty, headers);
	} catch (Exception e) {
	    bp.setServiceError("2004", "INFO", "Profile Not Found");
	    ;
	}
	if (StringUtils.isEmpty(loginRequest.getUsername())) {
	    bp.setServiceError("2001", "ERROR", "Username is required");
	}

	if (StringUtils.isEmpty(loginRequest.getPassword())) {
	    bp.setServiceError("2002", "ERROR", "Password is required");
	}
	if (response == null) {
	    bp.setServiceError("2003", "ERROR", "Invalid user credentials");
	} else {
	    bp.setResponse(response);
	    if (CollectionUtils.isEmpty(response.getMessages())) {
		bp.setSuccess(true);
	    }
	}
	LOG.info("Exisiting from login service");
	return bp;
    }

}
