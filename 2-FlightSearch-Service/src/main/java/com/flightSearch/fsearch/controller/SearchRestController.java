package com.flightSearch.fsearch.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightSearch.fsearch.entity.Flight;
import com.flightSearch.fsearch.service.SearchQuery;
import com.flightSearch.fsearch.service.SearchService;

@RestController
@RequestMapping("/api/flightApp")
@CrossOrigin
@RefreshScope
public class SearchRestController {
	
	@Autowired
	private SearchService searchService;
	
	@Value("${originairport.shutdown}")
	  private String originAirportShutdownList;
	
	@PostMapping("/findFlights")
	public List<Flight> searchFlights(@RequestBody SearchQuery searchQuery){
		System.out.println(searchQuery);
		System.out.println("Origin Airport Shutdown====>"+originAirportShutdownList);
		return searchService.search(searchQuery);
	}
	
	@GetMapping("/findFlight/{id}")
	public Flight findFlight(@PathVariable("id") long id){
		return searchService.findByFlightId(id);
	}
}
