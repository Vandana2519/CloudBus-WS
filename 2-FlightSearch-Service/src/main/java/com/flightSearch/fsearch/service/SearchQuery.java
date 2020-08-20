package com.flightSearch.fsearch.service;

import java.time.LocalDate;

public class SearchQuery {
	
	private String origin;
	private String destination;
	private LocalDate flightDate;
	private int numberofPassengers;
	
	public SearchQuery() {

	}
	
	public SearchQuery(String origin, String destination, LocalDate flightDate,int numberofPassengers) {
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
		this.numberofPassengers=numberofPassengers;
	}
	
	public SearchQuery(String origin, String destination, LocalDate flightDate) {
		this.origin = origin;
		this.destination = destination;
		this.flightDate = flightDate;
	}
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public LocalDate getFlightDate() {
		return flightDate;
	}

	public void setFlightDate(LocalDate flightDate) {
		this.flightDate = flightDate;
	}
	
	

	public int getNumberofPassengers() {
		return numberofPassengers;
	}

	public void setNumberofPassengers(int numberofPassengers) {
		this.numberofPassengers = numberofPassengers;
	}

	@Override
	public String toString() {
		return "SearchQuery [origin=" + origin + ", destination=" + destination + ", flightDate=" + flightDate + "numberofPassengers= "+numberofPassengers+" ]";
	}
}
