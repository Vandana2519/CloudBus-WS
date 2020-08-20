package com.flightBooking.fbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.fbooking.entity.BookingRecord;

public interface BookingRecordDao extends JpaRepository<BookingRecord, Long>{
	
	BookingRecord findByBookingId(long bookingId);
}
