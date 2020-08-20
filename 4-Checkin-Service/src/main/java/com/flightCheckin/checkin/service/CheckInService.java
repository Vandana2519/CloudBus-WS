package com.flightCheckin.checkin.service;

import com.flightCheckin.checkin.entity.CheckIn;

public interface CheckInService {
	
	CheckIn checkIn(long bookingId);

	CheckIn getCheckInInfo(long bookingId);
}
