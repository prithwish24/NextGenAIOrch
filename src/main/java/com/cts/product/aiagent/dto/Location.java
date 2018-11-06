package com.cts.product.aiagent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class Location {
	@JsonProperty("admin-area")		private String adminArea;
	@JsonProperty("business-name")	private String businessName;
	@JsonProperty("city")			private String city;
	@JsonProperty("country")		private String country;
	@JsonProperty("island")			private String island;
	@JsonProperty("shortcut")		private String shortcut;
	@JsonProperty("street-address")	private String streetAddress;
	@JsonProperty("subadmin-area")	private String subadminArea;
	@JsonProperty("zip-code")		private String zipCode;
	
	public String getAdminArea() {
		return adminArea;
	}
	public void setAdminArea(String adminArea) {
		this.adminArea = adminArea;
	}
	public String getBusinessName() {
		return businessName;
	}
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getIsland() {
		return island;
	}
	public void setIsland(String island) {
		this.island = island;
	}
	public String getShortcut() {
		return shortcut;
	}
	public void setShortcut(String shortcut) {
		this.shortcut = shortcut;
	}
	public String getStreetAddress() {
		return streetAddress;
	}
	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}
	public String getSubadminArea() {
		return subadminArea;
	}
	public void setSubadminArea(String subadminArea) {
		this.subadminArea = subadminArea;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
}
