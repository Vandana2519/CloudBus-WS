package com.flightBooking.fbooking.service;

import com.flightBooking.fbooking.entity.BookingRecord;
import com.flightBooking.fbooking.entity.Passenger;

public interface BookingService {
	
	Passenger bookFlight(Passenger passenger, long id, int numberOfPassengers);
	public void updateStatus(String status, long bookingId);
	public BookingRecord getBookingInfo(long bookingId);
	
}
