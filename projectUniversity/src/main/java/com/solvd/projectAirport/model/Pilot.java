package com.solvd.projectAirport.model;

import java.util.List;

public class Pilot extends AbstractEntity{
	private String firstName;
	private String lastName;
	private List<Licence> licences;
	
	public Pilot() {
		super();
	}

	public Pilot(long id, String firstName, String lastName, List<Licence> licences) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.licences = licences;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
