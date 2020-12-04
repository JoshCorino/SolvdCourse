package com.solvd.projectAirport.model;

public class Hangar extends AbstractEntity {
	private String capacity;
	private String location;
	
	
	public Hangar() {
		super();
	}

	public Hangar(long id, String capacity, String location) {
		super(id);
		this.capacity = capacity;
		this.location = location;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
}
