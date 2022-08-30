package com.hnt.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.hnt.FlightRepository;
import com.hnt.entity.Flight;
@ExtendWith(MockitoExtension.class)
class AdminServiceTest {
	@InjectMocks
	AdminService service;
	
	@Mock
	FlightRepository repository;
	@Test
	void testAdd() {
		Flight flight = new Flight();
		flight.setFlightId(1001);
		flight.setAirline("ABCD");
		flight.setFromPlace("India");
		flight.setToPlace("US");
		flight.setCost(1);
		when(repository.save(flight)).thenReturn(flight);//mock
		service.add(flight);
		assertEquals(1001,	flight.getFlightId());
	}
	
	@Test
	void testAddForException() {
		assertThrows(IllegalArgumentException.class, ()->{
			Flight flight = new Flight();
			flight.setFlightId(1001);
			flight.setAirline("Ram");
			flight.setFromPlace("India");
			flight.setToPlace("US");
			flight.setCost(1);
			service.add(flight);
		});
	}

}
