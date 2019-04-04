package com.cts.product.lrd;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import com.cts.product.aiagent.dto.Airport;
import com.cts.product.aiagent.dto.Location;

@Service
public class LocationServiceImpl implements LocationService {

    public com.cts.product.lrd.Location findBranchByLocation(Location location) {
	com.cts.product.lrd.Location loc = null;
	// TODO

	// temporary code
	if ("airport".equalsIgnoreCase(location.getBusinessName())) {
	    if ("St. Louis".equalsIgnoreCase(location.getCity())) {
		loc = new com.cts.product.lrd.Location("STL");
		loc.setName("St. Louis Lambert International Airport");
	    } else if ("Dallas".equalsIgnoreCase(location.getCity())) {
		loc = new com.cts.product.lrd.Location("DAL");
		loc.setName("Dallas/Fort Worth International Airport");
	    } else if ("New York".equalsIgnoreCase(location.getCity())) {
		loc = new com.cts.product.lrd.Location("JFK");
		loc.setName("JFK International Airport");
	    } else if ("Chicago".equalsIgnoreCase(location.getCity())) {
		loc = new com.cts.product.lrd.Location("ORD");
		loc.setName("O'Hare International Airport");
	    } else if ("Denver".equalsIgnoreCase(location.getCity())) {
		loc = new com.cts.product.lrd.Location("DEN");
		loc.setName("Denver International Airport");
	    }
	}

	return loc;
    }

    @Override
    public String findLocationByGpsLocation(long lat, long lng) {
	// TODO Auto-generated method stub
	return null;
    }

    @Override
    public String findBranch(Airport airport) {
	return findBranch(airport.getCity());
    }

    @Override
    public String findBranch(String locationStr) {
	Map<String, String> locatioMap = new HashMap<String, String>();
	locatioMap.put("CLTT61", "Charlotte");
	locatioMap.put("STLT61", "St. Louis");
	locatioMap.put("MDWT61", "Chicago");
	locatioMap.put("LAST61", "Las Vegas");
	locatioMap.put("ORDT61", "Chicago");
	locatioMap.put("ATLT61", "Atlanta");
	locatioMap.put("LAXT61", "Los Angeles");
	locatioMap.put("SEAT61", "Seattle");
	locatioMap.put("MIAT61", "Miami");
	locatioMap.put("MCOT61", "Orlando");
	String result = null;
	for (Entry<String, String> entry : locatioMap.entrySet()) {
	    if (locationStr.equals(entry.getValue())) {
		result = entry.getKey();
	    }
	}
	return result;
    }
}
