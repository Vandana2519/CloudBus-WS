package com.fareservice.fareMS.service;

import java.time.LocalDate;

import org.springframework.stereotype.Service;

import com.fareservice.fareMS.entity.Fares;

@Service
public interface FaresService {
	
	Fares getFare(String flightNumber,LocalDate filghtDate);
	
	Fares getFareByFlightId(long id);
}
