package com.flightCheckin.checkin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightCheckin.checkin.entity.CheckIn;
import com.flightCheckin.checkin.service.CheckInService;

@RestController
@CrossOrigin
@RequestMapping("/api/flighApp")
public class CheckinRestController {
	
	@Autowired
	private CheckInService checkinService;
	
	@PostMapping("/checkIn/{bookingId}")
	public CheckIn checkIn(@PathVariable("bookingId")long bookingId) {
		return  checkinService.checkIn(bookingId);
	}
	
	@GetMapping("/checkIn/{bookingId}")
	public CheckIn getCheckinInfo(@PathVariable("bookingId")long bookingId) {
		return checkinService.getCheckInInfo(bookingId);
	}
	
}
