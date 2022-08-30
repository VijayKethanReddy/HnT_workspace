package com.hnt.service;

import com.hnt.FlightRepository;
import com.hnt.entity.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hnt.entity.Flight;

@Service
public class AdminService {
	
	@Autowired
	FlightRepository repository;
	
	public Flight add(Flight flight) {
		if (flight.getAirline().equals("Ram"))
			throw new IllegalArgumentException("message");
		else
			repository.save(flight);
		return flight;
		
	}

	public Iterable<Flight> getFlights() {
		return repository.findAll();
	}

}
