package com.hnt;

import org.springframework.data.repository.CrudRepository;

import com.hnt.entity.Flight;

public interface FlightRepository extends CrudRepository<Flight, Integer>{

}
