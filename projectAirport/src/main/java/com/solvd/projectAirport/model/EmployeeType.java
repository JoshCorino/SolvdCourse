package com.solvd.projectAirport.model;

public class EmployeeType extends AbstractEntity{
	private String name;
	private String description;
	
	
	public EmployeeType() {
		super();
	}

	public EmployeeType(long id, String name, String description) {
		super(id);
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "EmployeeType [name=" + name + ", description=" + description + "]";
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

}
