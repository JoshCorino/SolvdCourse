package com.solvd.projectAirport.model;

import java.sql.Date;

public class ControlTowerLog extends AbstractEntity {
	private Date date;
	private Employee emp;
	private Flight flight;
	
	public ControlTowerLog() {
		super();
	}
	public ControlTowerLog(long id, Date date, Employee emp, Flight flight) {
		super(id);
		this.date = date;
		this.emp = emp;
		this.flight = flight;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
}
