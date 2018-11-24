package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;



//@JsonIgnoreProperties
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Parameters {
    @JsonProperty("geolocation")	private String geoLocation;
    @JsonProperty("localtime")	    private String localTime;
    @JsonProperty("agentname")	    private String agentName;
    @JsonProperty("pickupLocation") private Location pickupLocation;
    
    
    // Input parameters
    @JsonProperty("airport")		private Airport airport;
    //@JsonProperty("airport")		private String airport;
    @JsonProperty("geo-city")		private String geoCity;
    @JsonProperty("zip-code")		private String zipCode;
    @JsonProperty("address")		private String address;
    @JsonProperty("date")			private String date;
    @JsonProperty("time")			private String time;
    @JsonProperty("car-class")		private String carclass;
    @JsonProperty("duration")		private String duration;
    @JsonProperty("date-period")	private String datePeriod;
    @JsonProperty("firstname")		private String firstName;
    @JsonProperty("lastname")		private String lastName;
    
    
    // Output parameters
    @JsonProperty("pickup-branchcode")		private String branchCode;
    
    
    
	public String getGeoLocation() {
		return geoLocation;
	}
	public void setGeoLocation(String geoLocation) {
		this.geoLocation = geoLocation;
	}
	public String getLocalTime() {
		return localTime;
	}
	public void setLocalTime(String localTime) {
		this.localTime = localTime;
	}
	public String getAgentName() {
		return agentName;
	}
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}
	public Location getPickupLocation() {
		return pickupLocation;
	}
	public void setPickupLocation(Location pickupLocation) {
		this.pickupLocation = pickupLocation;
	}
	public String getGeoCity() {
		return geoCity;
	}
	public void setGeoCity(String geoCity) {
		this.geoCity = geoCity;
	}
	public Airport getAirport() {
		return airport;
	}
	public void setAirport(Airport airport) {
		this.airport = airport;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCarclass() {
		return carclass;
	}
	public void setCarclass(String carclass) {
		this.carclass = carclass;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getDatePeriod() {
		return datePeriod;
	}
	public void setDatePeriod(String datePeriod) {
		this.datePeriod = datePeriod;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getBranchCode() {
		return branchCode;
	}
	public void setBranchCode(String branchCode) {
		this.branchCode = branchCode;
	}     
}
