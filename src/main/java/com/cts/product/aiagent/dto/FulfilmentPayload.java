package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class FulfilmentPayload {
	@JsonProperty(value = "positive", access = Access.AUTO) private String positive;
	@JsonProperty(value = "negetive", access = Access.AUTO) private String negetive;
	
	@JsonProperty(value = "no-firstname", access = Access.AUTO) private String noFirstname;
	@JsonProperty(value = "no-lastname", access = Access.AUTO) 	private String noLastname;
	
	
	public String getPositive() {
		return positive;
	}
	public void setPositive(String positive) {
		this.positive = positive;
	}
	public String getNegetive() {
		return negetive;
	}
	public void setNegetive(String negetive) {
		this.negetive = negetive;
	}
	public String getNoFirstname() {
		return noFirstname;
	}
	public void setNoFirstname(String noFirstname) {
		this.noFirstname = noFirstname;
	}
	public String getNoLastname() {
		return noLastname;
	}
	public void setNoLastname(String noLastname) {
		this.noLastname = noLastname;
	}
}
