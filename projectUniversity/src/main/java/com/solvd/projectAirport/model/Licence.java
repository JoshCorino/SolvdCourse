package com.solvd.projectAirport.model;

public class Licence extends AbstractEntity{
	private String name;
	private String description;
	
	
	public Licence() {
		super();
	}

	public Licence(long id, String name, String description) {
		super(id);
		this.name = name;
		this.description = description;
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
	
}
