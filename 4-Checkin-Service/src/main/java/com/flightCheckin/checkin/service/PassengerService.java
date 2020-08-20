package com.flightCheckin.checkin.service;

import com.flightCheckin.checkin.entity.BookingRecord;
import com.flightCheckin.checkin.entity.Passenger;

public interface PassengerService {
	Passenger findByBookingRecord(BookingRecord bookingRecord);
}
