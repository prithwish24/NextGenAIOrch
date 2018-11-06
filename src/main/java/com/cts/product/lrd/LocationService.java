package com.cts.product.lrd;

import com.cts.product.aiagent.dto.Location;

public interface LocationService {
	com.cts.product.lrd.Location findBranchByLocation(Location location);
	String findLocationByGpsLocation(long lat, long lng); 
}
