package com.cts.product.aiagent.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class OutputContext {
    @JsonProperty("name")
    private String name;
    @JsonProperty("lifespanCount")
    private Integer lifespanCount;
    @JsonProperty("parameters")
    private Parameters parameters;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public Integer getLifespanCount() {
	return lifespanCount;
    }

    public void setLifespanCount(Integer lifespanCount) {
	this.lifespanCount = lifespanCount;
    }

    public Parameters getParameters() {
	return parameters;
    }

    public void setParameters(Parameters parameters) {
	this.parameters = parameters;
    }

    @Override
    public boolean equals(Object obj) {
	if (obj != null && obj instanceof OutputContext) {
	    return new EqualsBuilder().append(name, ((OutputContext) obj).getName()).isEquals();
	}
	return false;
    }

    @Override
    public int hashCode() {
	return new HashCodeBuilder().append(name).toHashCode();
    }
}
