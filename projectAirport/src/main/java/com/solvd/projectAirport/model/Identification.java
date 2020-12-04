package com.solvd.projectAirport.model;

public class Identification extends AbstractEntity{
	private String type;
	private String description;
	private Country country;
	
	
	public Identification() {
		super();
	}

	public Identification(long id, String type, String description, Country country) {
		super(id);
		this.type = type;
		this.description = description;
		this.country = country;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Identification [type=" + type + ", description=" + description + ", country=" + country + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}
	
}
