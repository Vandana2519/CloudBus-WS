package com.flightBooking.fbooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightBooking.fbooking.entity.Passenger;

public interface PassengerDao extends JpaRepository<Passenger, Long>{

}
