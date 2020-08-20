package com.flightCheckin.checkin.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightCheckin.checkin.entity.CheckIn;

public interface CheckInDao extends JpaRepository<CheckIn,Long>{
	
	CheckIn findByBookingId(long bookingId);
	
	boolean existsByBookingId(long bookingId);
}
