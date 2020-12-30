package com.solvd.projectAirport.model;

import java.util.ArrayList;
import java.util.List;

public class Passenger extends AbstractEntity{
	private String firstName;
	private String lastName;
	private List<Identification> identifications;
	
	
	public Passenger() {
		super();
		identifications=new ArrayList<Identification>();
	}

	public Passenger(long id, String firstName, String lastName, List<Identification> identifications) {
		super(id);
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.identifications = identifications;
	}
	
	@Override
	public String toString() {
		return "Passenger [firstName=" + firstName + ", lastName=" + lastName + ", identifications=" + identifications
				+ "]";
	}

	public void setIdentifications(List<Identification> i) {
		identifications=i;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void addIdentification(Identification e) {
		identifications.add(e);
		
	}

	public List<Identification> getIdentifications() {
		return identifications;
	}
	
}
