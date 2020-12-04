package com.solvd.projectUniversity.enumerate;

public enum RoomsCapacities {

	PHISICS_LAB_TEN("Phisics lab", 10),
	PHISICS_LAB_TWENTY("Phisics lab", 20),
	PHISICS_LAB_FIFTY("Phisics lab", 50),
	COMPUTER_LAB_TEN("Computer lab", 10),
	COMPUTER_LAB_TWENTY("Computer lab", 20),
	COMPUTER_LAB_FIFTY("Computer lab", 50),
	CLASSROOM_TEN("Classroom", 10),
	CLASSROOM_TWENTY("Classroom", 20),
	CLASSROOM_FIFTY("Classroom", 50),
	CLASSROOM_ONEHUNDRED("Classroom",100);

	private String name;
	private int capacity;
	
	private RoomsCapacities(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}

	public String getName() {
		return name;
	}

	public int getCapacity() {
		return capacity;
	}
	

}
