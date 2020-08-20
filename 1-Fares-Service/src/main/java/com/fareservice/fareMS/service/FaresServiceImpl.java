package com.fareservice.fareMS.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fareservice.fareMS.dao.FlightDao;
import com.fareservice.fareMS.entity.Fares;
import com.fareservice.fareMS.entity.Flight;

@Service
public class FaresServiceImpl implements FaresService{
	
	@Autowired
	private FlightDao flightDao;
	
	public Fares getFare(String flightNumber, LocalDate flightDate) {
		return flightDao.findByFlightNumberAndFlightDate(flightNumber, flightDate).getFares();
		
	}

	public Fares getFareByFlightId(long id) {
		Flight flight=flightDao.findById(id).orElse(null);
		if(flight!=null) {
			return flight.getFares();
		}
		return null;	
	}

}
