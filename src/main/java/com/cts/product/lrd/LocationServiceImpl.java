package com.cts.product.lrd;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cts.product.aiagent.dto.Location;

@Service
public class LocationServiceImpl implements LocationService {

	@Override
	public com.cts.product.lrd.Location findBranchByLocation(Location location) {
		com.cts.product.lrd.Location loc = null; 
		// TODO  
		
		// temporary code
		if ("airport".equalsIgnoreCase(location.getBusinessName())) {
			if ("St. Louis".equalsIgnoreCase(location.getCity())) {
				loc = new com.cts.product.lrd.Location("STL");
				loc.setName("St. Louis Lambert International Airport");
			} else if ("Dallas".equalsIgnoreCase(location.getCity()) ) {
				loc = new com.cts.product.lrd.Location("DAL");
				loc.setName("Dallas/Fort Worth International Airport");
			} else if ("New York".equalsIgnoreCase(location.getCity()) ) {
				loc = new com.cts.product.lrd.Location("JFK");
				loc.setName("JFK International Airport");
			} else if ("Chicago".equalsIgnoreCase(location.getCity()) ) {
				loc = new com.cts.product.lrd.Location("ORD");
				loc.setName("O'Hare International Airport");
			} else if ("Denver".equalsIgnoreCase(location.getCity()) ) {
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

}
