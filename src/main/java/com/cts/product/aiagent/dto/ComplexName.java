package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComplexName {
	@JsonProperty("given-name") private String givenName;
	@JsonProperty("last-name") private String lastName;
	
	public String getGivenName() {
		return givenName;
	}
	public void setGivenName(String givenName) {
		this.givenName = givenName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
}
