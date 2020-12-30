package com.solvd.projectAirport.model;

import java.sql.Date;

public class InmigrationLog extends AbstractEntity{
	private Date date;
	private Passenger passenger;
	private Flight flight;
	
	
	public InmigrationLog() {
		super();
	}
	public InmigrationLog(long id, Date date, Passenger passenger, Flight flight) {
		super(id);
		this.date = date;
		this.passenger = passenger;
		this.flight = flight;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Passenger getPassenger() {
		return passenger;
	}
	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	@Override
	public String toString() {
		return "InmigrationLog [date=" + date + ", passenger=" + passenger + ", flight=" + flight + "]";
	}
	
}
