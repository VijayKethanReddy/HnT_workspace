package com.hnt.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.entity.Flight;
import com.hnt.service.AdminService;

@ExtendWith(MockitoExtension.class)
class AdminControllerTest {
	@Mock
	AdminService service;
	@InjectMocks
	AdminController controller;

	@Test
	void testAddFlights() {
		Flight flight = new Flight();
		flight.setFlightId(1001);
		flight.setAirline("ABCD");
		flight.setFromPlace("India");
		flight.setToPlace("US");
		flight.setCost(1);
		when(service.add(flight)).thenReturn(flight);// mocking
		Integer flightId = controller.addFlights(flight);
		assertEquals(1001, flightId);
	}

	@Test
	void testGetFlights() {
		Iterable<Flight> flights = new ArrayList<>();
		when(service.getFlights()).thenReturn(flights);
		Iterable<Flight> actual = controller.getFlights();
		assertEquals(flights, actual);
	}
}
