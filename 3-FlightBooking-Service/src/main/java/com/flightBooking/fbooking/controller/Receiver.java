package com.flightBooking.fbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.flightBooking.fbooking.service.BookingService;

@Controller
public class Receiver {
	
	@Autowired
	private BookingService bookingSerice;

	//@RabbitListener(queues = "CheckINQ")
	public void processMessage(long bookingID) {
		bookingSerice.updateStatus("CHECKED-IN", bookingID);
	}
}
