package com.cts.product.lrd;

import com.cts.product.aiagent.dto.Airport;

public interface LocationService {
	String findLocationByGpsLocation(long lat, long lng);
	String findBranch(Airport airport);
	String findBranch(String locationStr);
}
