package com.solvd.projectAirport.model;

public class Airline extends AbstractEntity{
	private String name;
	private String contact;
	
	public Airline() {
		super();
	}
	public Airline(long id, String name, String contact) {
		super(id);
		this.name = name;
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "Airline [name=" + name + ", contact=" + contact + "]";
	}
	
}
