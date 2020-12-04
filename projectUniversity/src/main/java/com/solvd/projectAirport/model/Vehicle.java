package com.solvd.projectAirport.model;

public class Vehicle extends AbstractEntity{
	private String name;
	private String description;
	private EmployeeType typeOfEmployeeAutorized;
	
	public Vehicle() {
		super();
	}

	public Vehicle(long id, String name, String description, EmployeeType typeOfEmployeeAutorized) {
		super(id);
		this.name = name;
		this.description = description;
		this.typeOfEmployeeAutorized = typeOfEmployeeAutorized;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public EmployeeType getTypeOfEmployeeAutorized() {
		return typeOfEmployeeAutorized;
	}

	public void setTypeOfEmployeeAutorized(EmployeeType typeOfEmployeeAutorized) {
		this.typeOfEmployeeAutorized = typeOfEmployeeAutorized;
	}
	
}
