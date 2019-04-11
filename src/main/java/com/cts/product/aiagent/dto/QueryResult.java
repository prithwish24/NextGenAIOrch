package com.cts.product.aiagent.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName("queryResult")
public class QueryResult {
    @JsonProperty("action")
    private String action;
    @JsonProperty("queryText")
    private String queryText;
    @JsonProperty("languageCode")
    private String languageCode;
    @JsonProperty("fulfillmentText")
    private String fulfillmentText;
    @JsonProperty("outputContexts")
    private List<OutputContext> outputContexts;
    @JsonProperty("fulfillmentMessages")
    private List<FulfillmentMessage> fulfillmentMessages;
    @JsonProperty("intent")
    private Intent intent;

    public Intent getIntent() {
	return intent;
    }

    public void setIntent(Intent intent) {
	this.intent = intent;
    }

    public String getAction() {
	return (action != null && !action.trim().isEmpty()) ? action.trim() : null;
    }

    public void setAction(String action) {
	this.action = action;
    }

    public String getQueryText() {
	return queryText;
    }

    public void setQueryText(String queryText) {
	this.queryText = queryText;
    }

    public String getLanguageCode() {
	return languageCode;
    }

    public void setLanguageCode(String languageCode) {
	this.languageCode = languageCode;
    }

    public String getFulfillmentText() {
	return fulfillmentText;
    }

    public void setFulfillmentText(String fulfillmentText) {
	this.fulfillmentText = fulfillmentText;
    }

    public List<OutputContext> getOutputContexts() {
	return outputContexts;
    }

    public void setOutputContexts(List<OutputContext> outputContexts) {
	this.outputContexts = outputContexts;
    }

    public void addOutputContext(OutputContext outputContext) {
	if (this.outputContexts == null)
	    this.outputContexts = new ArrayList<>();
	this.outputContexts.add(outputContext);
    }

    public List<FulfillmentMessage> getFulfillmentMessages() {
	return fulfillmentMessages;
    }

    public void setFulfillmentMessages(List<FulfillmentMessage> fulfillmentMessages) {
	this.fulfillmentMessages = fulfillmentMessages;
    }

    public void addFulfillmentMessage(FulfillmentMessage fulfillmentMessage) {
	if (this.fulfillmentMessages == null)
	    this.fulfillmentMessages = new ArrayList<>();
	this.fulfillmentMessages.add(fulfillmentMessage);
    }
}
