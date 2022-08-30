package com.hnt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class Flight {
	@Id
	@NotNull(message = "flightId cannot be blank#######")
	private Integer flightId;
	@NotBlank(message = "airline cannot be blank#######")
	private String airline;
	@NotBlank(message = "fromPlace cannot be blank#######")
	private String fromPlace;
	@NotBlank(message = "toPlace cannot be blank#######")
	private String toPlace;
	@Min(value = 1, message = "cost cannot be less than 1")
	private int cost;
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getAirline() {
		return airline;
	}
	public void setAirline(String airline) {
		this.airline = airline;
	}
	public String getFromPlace() {
		return fromPlace;
	}
	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}
	public String getToPlace() {
		return toPlace;
	}
	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
