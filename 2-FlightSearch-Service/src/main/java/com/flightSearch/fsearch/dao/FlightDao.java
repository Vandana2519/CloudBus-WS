package com.flightSearch.fsearch.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flightSearch.fsearch.entity.Flight;

public interface FlightDao extends JpaRepository<Flight, Long>{
	
	List<Flight> findByOriginAndDestinationAndFlightDate(String origin,String destination, LocalDate flightDate);
	
	Flight findByFlightNumberAndFlightDate(String flightNumber, LocalDate flightDate);
}
