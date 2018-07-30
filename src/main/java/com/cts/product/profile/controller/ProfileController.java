package com.cts.product.profile.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.profile.delegate.ProfileServiceDelegate;
import com.cts.product.profile.domain.BaseResponse;
import com.cts.product.profile.domain.UserProfile;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;

@RestController
@RequestMapping("/")
@ComponentScan(basePackages = { "com.cts.product.profile" })
public class ProfileController {
    private static final Logger LOG = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private ProfileServiceDelegate delegate;

    @RequestMapping(value = "/login", method = { RequestMethod.GET,
	    RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<UserProfile> userlogin(@RequestBody com.cts.product.profile.domain.LoginRequest loginRequest) {
	LOG.debug("Inside userlogin(");

	BaseResponse<UserProfile> bp = new BaseResponse<>();
	if (StringUtils.isEmpty(loginRequest.getUsername())) {
	    bp.setServiceError("2001", "ERROR", "Username is required");
	}

	if (StringUtils.isEmpty(loginRequest.getPassword())) {
	    bp.setServiceError("2001", "ERROR", "Password is required");
	}

	if (!StringUtils.isEmpty(loginRequest.getUsername()) && !StringUtils.isEmpty(loginRequest.getPassword())) {
	    UserProfile profile = delegate.authenticate(loginRequest.getUsername(), loginRequest.getPassword());
	    if (profile == null) {
		bp.setServiceError("2001", "ERROR", "Invalid user credentials");
	    } else {
		bp.setSuccess(true);
		bp.setResponse(profile);
		bp.setSessionId(delegate.createSession(profile.getUsername()));
	    }
	}
	return bp;
    }

    @RequestMapping(value = "/getprofile", method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<UserProfile> getProfile(
	    @RequestParam(name = "username", required = true, defaultValue = "") String username) {
	LOG.debug("Inside getProfile(");
	BaseResponse<UserProfile> bp = new BaseResponse<>();

	if (StringUtils.isEmpty(username)) {
	    bp.setServiceError("2002", "INFO", "Profile Not Found");
	} else {
	    UserProfile profile = delegate.getUserProfile(username);
	    bp.setResponse(profile);
	    bp.setSuccess(true);
	}
	return bp;
    }

    @RequestMapping(value = "/logout", method = { RequestMethod.GET,
	    RequestMethod.POST }, produces = MediaType.APPLICATION_JSON_VALUE)
    public BaseResponse<?> logout(
	    @RequestParam(name = "username", required = true, defaultValue = "") String username) {
	LOG.debug("Inside logout");

	BaseResponse<?> bp = new BaseResponse<Object>();
	delegate.logout(username);
	bp.setSuccess(true);
	return bp;
    }

    @RequestMapping(value = "/{brand}/{channel}/{loyalty}/login", method = RequestMethod.POST)
    public ProfileResponse login(@RequestBody LoginRequest loginRequest, @PathVariable("brand") String brand,
	    @PathVariable("channel") String channel, @PathVariable("loyalty") String loyalty,
	    HttpServletRequest request) {

	return delegate.login(loginRequest, brand, channel, loyalty);
    }

}