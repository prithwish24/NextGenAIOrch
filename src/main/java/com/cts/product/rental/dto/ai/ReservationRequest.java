
package com.cts.product.rental.dto.ai;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "responseId", "queryResult", "originalDetectIntentRequest", "session" })
public class ReservationRequest {

	@JsonProperty("responseId")
	private String responseId;
	@JsonProperty("queryResult")
	private QueryResult queryResult;
	@JsonProperty("originalDetectIntentRequest")
	private OriginalDetectIntentRequest originalDetectIntentRequest;
	@JsonProperty("session")
	private String session;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	@JsonProperty("responseId")
	public String getResponseId() {
		return responseId;
	}

	@JsonProperty("responseId")
	public void setResponseId(String responseId) {
		this.responseId = responseId;
	}

	@JsonProperty("queryResult")
	public QueryResult getQueryResult() {
		return queryResult;
	}

	@JsonProperty("queryResult")
	public void setQueryResult(QueryResult queryResult) {
		this.queryResult = queryResult;
	}

	@JsonProperty("originalDetectIntentRequest")
	public OriginalDetectIntentRequest getOriginalDetectIntentRequest() {
		return originalDetectIntentRequest;
	}

	@JsonProperty("originalDetectIntentRequest")
	public void setOriginalDetectIntentRequest(OriginalDetectIntentRequest originalDetectIntentRequest) {
		this.originalDetectIntentRequest = originalDetectIntentRequest;
	}

	@JsonProperty("session")
	public String getSession() {
		return session;
	}

	@JsonProperty("session")
	public void setSession(String session) {
		this.session = session;
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
