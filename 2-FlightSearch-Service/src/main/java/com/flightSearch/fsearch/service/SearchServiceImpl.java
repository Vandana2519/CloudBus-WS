package com.flightSearch.fsearch.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightSearch.fsearch.dao.FlightDao;
import com.flightSearch.fsearch.entity.Flight;
import com.flightSearch.fsearch.entity.Inventory;

@Service
public class SearchServiceImpl implements SearchService{

	@Autowired
	private FlightDao flightDao;
	
	@Override
	public Flight findByFlightId(long id) {
		
		return flightDao.findById(id).orElse(null);
	}

	@Override
	public List<Flight> search(SearchQuery searchQuery) {
		
		List<Flight> flights = flightDao.findByOriginAndDestinationAndFlightDate(searchQuery.getOrigin(),
				searchQuery.getDestination(), searchQuery.getFlightDate());

		Stream<Flight> searchResult = flights.stream()
				.filter(flight -> flight.getInventory().getCount() >= searchQuery.getNumberofPassengers());

		return searchResult.collect(Collectors.toList());
	}

	@Override
	public Flight findByFlightNumberAndFlightDate(String flightNumber, LocalDate flightDate) {
		
		return flightDao.findByFlightNumberAndFlightDate(flightNumber, flightDate);
	}

	@Override
	public void updateInventory(String flightNumber, LocalDate flightDate, int new_inventory) {
		
		Flight flight = flightDao.findByFlightNumberAndFlightDate(flightNumber, flightDate);
		if (flight != null) {
			Inventory inv = flight.getInventory();
			inv.setCount(inv.getCount() - new_inventory);
			flightDao.save(flight);
		} else { // flight info is not available yet in search schema
			throw new RuntimeException("====> Failed");
		}
		
	}

}
