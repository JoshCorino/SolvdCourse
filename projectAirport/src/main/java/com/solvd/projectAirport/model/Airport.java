package com.solvd.projectAirport.model;

import java.util.List;

public class Airport extends AbstractEntity {
	private String name;
	private String type;
	private double landingTrackLongitude;
	private City city;
	private List<Hangar> hangars;
	private List<Gate> gates;
	private List<Vehicle> vehicles;
	
	public Airport() {
		super();
	}

	public Airport(long id, String name, String type, double landingTrackLongitude, City city, List<Hangar> hangars,
			List<Gate> gates, List<Vehicle> vehicles) {
		super(id);
		this.name = name;
		this.type = type;
		this.landingTrackLongitude = landingTrackLongitude;
		this.city = city;
		this.hangars = hangars;
		this.gates = gates;
		this.vehicles = vehicles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getLandingTrackLongitude() {
		return landingTrackLongitude;
	}

	public void setLandingTrackLongitude(double landingTrackLongitude) {
		this.landingTrackLongitude = landingTrackLongitude;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
	
	
	
}
