package com.solvd.projectAirport.model;

public class Employee extends AbstractEntity {
	private String firstName;
	private String lastName;
	private String cellphone;
	private EmployeeType type;
	
	
	public Employee() {
		super();
	}

	public Employee(long id, String firstName, String lastName, String cellphone, EmployeeType type) {
		super(id);
		this.firstName = firstName;
		this.lastName = lastName;
		this.cellphone = cellphone;
		this.type = type;
	}

	public String getFirstName() {
		return firstName;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", cellphone=" + cellphone + ", type="
				+ type + "]";
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

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public EmployeeType getType() {
		return type;
	}

	public void setType(EmployeeType type) {
		this.type = type;
	}
}
