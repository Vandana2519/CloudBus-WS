package com.fareservice.fareMS.controller;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fareservice.fareMS.entity.Fares;
import com.fareservice.fareMS.service.FaresService;

@RestController
@RefreshScope
@RequestMapping("/api/flightApp")
public class FareRestController {

	@Autowired
	private FaresService faresService;
	
	@Value("${fares.discount}")
	  private String faresDiscount;
	
	@GetMapping("/getFare/{flightNumber}/{flightDate}")
	public Fares getFare(@PathVariable("flightNumber") String flightNumber,
			@PathVariable("flightDate") @DateTimeFormat(iso=DateTimeFormat.ISO.DATE) LocalDate flightDate){
		
		return faresService.getFare(flightNumber, flightDate);
	}
	
	@GetMapping("/getFare/{id}")
	public Fares getFareByFlightId(@PathVariable("id") long id){
		System.out.println("Fares Discount = " + faresDiscount);
		return faresService.getFareByFlightId(id);
	}
}
