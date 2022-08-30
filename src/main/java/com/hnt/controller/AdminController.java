package com.hnt.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hnt.entity.Flight;
import com.hnt.service.AdminService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController // spring bean
@RequestMapping("/admin")
public class AdminController extends BaseController{
	@Autowired // DI
	AdminService adminService; // dependency

	@GetMapping
	Iterable<Flight> getFlights() {
		return adminService.getFlights();
	}

	@PostMapping
	Integer addFlights(@Valid @RequestBody Flight flight) {
		adminService.add(flight);//mock
		System.out.println("second");
		return flight.getFlightId();
	}
}
