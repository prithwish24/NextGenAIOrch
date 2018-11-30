package com.cts.product.aiagent.converter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.cts.product.aiagent.dto.Airport;
import com.cts.product.aiagent.dto.Location;
import com.cts.product.aiagent.dto.Loggable;
import com.cts.product.config.JacksonConfiguration;
import com.fasterxml.jackson.databind.JsonNode;

@Component
public final class RequestConverter {
	static final Logger LOG = LoggerFactory.getLogger(RequestConverter.class);

	private JacksonConfiguration jacksonConfiguration;
	public RequestConverter(final JacksonConfiguration jacksonConfiguration) {
		this.jacksonConfiguration = jacksonConfiguration;
	}
	
	public String logRequestOrResponse (final Loggable object) {
		try {
			return jacksonConfiguration.toJson(object);
		} catch (IOException e) {
			LOG.error("Not able to print request. \n" + e.getMessage(), e);
		}
		return "";
	}
	
	public Location convertLocation(final String location) {
		try {
			Location loc = jacksonConfiguration.fromJson(location, Location.class);
			if (StringUtils.isNoneBlank(loc.getBusinessName(), loc.getCity())) {
				return loc;
			}
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
	
	public Airport convertAirport(String airport) {
		try {
			Airport ap = jacksonConfiguration.fromJson(airport, Airport.class);
			return ap;
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;		
	}
	
	/*public void convertAddress(String address) {
		try {
			Location loc = jacksonConfiguration.fromJson(location, Location.class);
			if (StringUtils.isNoneBlank(loc.getBusinessName(), loc.getCity())) {
				return loc;
			}
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;	
	}*/
	
	public Date convertDateTime(final String date, final String time) {
		try {
			LocalDate ld = LocalDate.parse(date, DateTimeFormatter.ISO_DATE_TIME);
			LocalTime lt = LocalDateTime.parse(time, DateTimeFormatter.ISO_DATE_TIME).toLocalTime();
			LocalDateTime pickupDateTime = LocalDateTime.of(ld, lt);
			return Date.from(pickupDateTime.atZone(ZoneId.systemDefault()).toInstant());

		} catch (DateTimeParseException dtpe) {
			LOG.error(dtpe.getMessage(), dtpe);
		}
		return null;
	}

	public <T> T convertFulfilmentPayload(String payload, Class<T> clazz) {
		try {
			return jacksonConfiguration.fromJson(payload, clazz);
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}
	
	public <T> T convertFulfilmentPayload(JsonNode payload, Class<T> clazz) {
		try {
			return jacksonConfiguration.fromJsonNode(payload, clazz);
		} catch (IOException e) {
			LOG.error(e.getMessage(), e);
		}
		return null;
	}

}
