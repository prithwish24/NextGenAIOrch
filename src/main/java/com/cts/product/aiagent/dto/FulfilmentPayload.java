package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class FulfilmentPayload {
	@JsonProperty(value = "positive", access = Access.AUTO) private String positive;
	@JsonProperty(value = "negetive", access = Access.AUTO) private String negetive;
	
	
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
	
}
