package com.solvd.projectAirport.model;

public class Gate extends AbstractEntity {
	private String name;
	private String location;
	
	public Gate() {
		super();
	}
	public Gate(long id, String name, String location) {
		super(id);
		this.name = name;
		this.location = location;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

}
