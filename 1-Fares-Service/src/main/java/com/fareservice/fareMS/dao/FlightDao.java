package com.fareservice.fareMS.dao;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fareservice.fareMS.entity.Flight;

@Repository
public interface FlightDao extends JpaRepository<Flight, Long>{
	
	public Flight findByFlightNumberAndFlightDate(String flightNumber,LocalDate flightDate);
}
