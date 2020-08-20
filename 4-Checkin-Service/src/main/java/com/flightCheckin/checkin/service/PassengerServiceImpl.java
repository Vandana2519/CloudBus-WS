package com.flightCheckin.checkin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightCheckin.checkin.dao.PassengerDao;
import com.flightCheckin.checkin.entity.BookingRecord;
import com.flightCheckin.checkin.entity.Passenger;

@Service
public class PassengerServiceImpl implements PassengerService{
	
	@Autowired
	private PassengerDao passengerDao;
	
	@Override
	public Passenger findByBookingRecord(BookingRecord bookingRecord) {
		// TODO Auto-generated method stub
		return passengerDao.findByBookingRecord(bookingRecord);
	}

}
