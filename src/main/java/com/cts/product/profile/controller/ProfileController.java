package com.cts.product.profile.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.profile.delegate.ProfileServiceDelegate;
import com.cts.product.profile.dto.messages.LoginRequest;
import com.cts.product.profile.dto.messages.ProfileResponse;

@RestController
public class ProfileController {
    private static final Logger LOG = LoggerFactory.getLogger(ProfileController.class);

    @Autowired
    private ProfileServiceDelegate delegate;

    @RequestMapping(value = "/{brand}/{channel}/{loyalty}/login", method = RequestMethod.POST)
    public ProfileResponse login(@RequestBody LoginRequest loginRequest, @PathVariable("brand") String brand,
	    @PathVariable("channel") String channel, @PathVariable("loyalty") String loyalty,
	    HttpServletRequest request, @RequestHeader HttpHeaders headers) throws Exception {

	return delegate.login(loginRequest, brand, channel, loyalty, headers);
    }

}
