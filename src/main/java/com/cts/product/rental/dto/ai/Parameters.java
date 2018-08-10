
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
@JsonPropertyOrder({ "pickuptime", "duration", "pickupdate.original", "pickupdate", "pickuptime.original",
	"duration.original" })
public class Parameters {

    @JsonProperty("pickuptime")
    private String pickuptime;
    @JsonProperty("duration")
    private Integer duration;
    @JsonProperty("pickupdate.original")
    private String pickupdateOriginal;
    @JsonProperty("pickupdate")
    private String pickupdate;
    @JsonProperty("pickuptime.original")
    private String pickuptimeOriginal;
    @JsonProperty("duration.original")
    private String durationOriginal;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pickuptime")
    public String getPickuptime() {
	return pickuptime;
    }

    @JsonProperty("pickuptime")
    public void setPickuptime(String pickuptime) {
	this.pickuptime = pickuptime;
    }

    @JsonProperty("duration")
    public Integer getDuration() {
	return duration;
    }

    @JsonProperty("duration")
    public void setDuration(Integer duration) {
	this.duration = duration;
    }

    @JsonProperty("pickupdate.original")
    public String getPickupdateOriginal() {
	return pickupdateOriginal;
    }

    @JsonProperty("pickupdate.original")
    public void setPickupdateOriginal(String pickupdateOriginal) {
	this.pickupdateOriginal = pickupdateOriginal;
    }

    @JsonProperty("pickupdate")
    public String getPickupdate() {
	return pickupdate;
    }

    @JsonProperty("pickupdate")
    public void setPickupdate(String pickupdate) {
	this.pickupdate = pickupdate;
    }

    @JsonProperty("pickuptime.original")
    public String getPickuptimeOriginal() {
	return pickuptimeOriginal;
    }

    @JsonProperty("pickuptime.original")
    public void setPickuptimeOriginal(String pickuptimeOriginal) {
	this.pickuptimeOriginal = pickuptimeOriginal;
    }

    @JsonProperty("duration.original")
    public String getDurationOriginal() {
	return durationOriginal;
    }

    @JsonProperty("duration.original")
    public void setDurationOriginal(String durationOriginal) {
	this.durationOriginal = durationOriginal;
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
