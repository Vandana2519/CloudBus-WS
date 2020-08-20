package com.flightCheckin.checkin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightCheckin.checkin.entity.BookingRecord;
import com.flightCheckin.checkin.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Integer>{
	
	Passenger findByBookingRecord(BookingRecord bookingRecord);
}
