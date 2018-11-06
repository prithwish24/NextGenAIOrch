
package com.cts.product.aiagent.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "text", "card" })
public class FulfillmentMessage {
	@JsonProperty("card")
	private Card card;
	@JsonProperty("text")
	private Text text;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("card")
	public Card getCard() {
		return card;
	}

	@JsonProperty("card")
	public void setCard(Card card) {
		this.card = card;
	}

	@JsonProperty("text")
	public Text getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(Text text) {
		this.text = text;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}
