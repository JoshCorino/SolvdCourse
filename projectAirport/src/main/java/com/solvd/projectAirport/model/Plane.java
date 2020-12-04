package com.solvd.projectAirport.model;


public class Plane extends AbstractEntity{
	private String model;
	private int passengersCapacity;
	private double fuelCapacity;
	private Airline airline;
	
	
	public Plane() {
		super();
	}
	public Plane(long id, String model, int passengersCapacity, double fuelCapacity, Airline airline) {
		super(id);
		this.model = model;
		this.passengersCapacity = passengersCapacity;
		this.fuelCapacity = fuelCapacity;
		this.airline = airline;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPassengersCapacity() {
		return passengersCapacity;
	}
	public void setPassengersCapacity(int passengersCapacity) {
		this.passengersCapacity = passengersCapacity;
	}
	public double getFuelCapacity() {
		return fuelCapacity;
	}
	public void setFuelCapacity(double fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}
	public Airline getIdAirline() {
		return airline;
	}
	public void setIdAirline(Airline airline) {
		this.airline = airline;
	}
	@Override
	public String toString() {
		return "Plane [model=" + model + ", passengersCapacity=" + passengersCapacity + ", fuelCapacity=" + fuelCapacity
				+ ", airline=" + airline + "]";
	}
	
}
