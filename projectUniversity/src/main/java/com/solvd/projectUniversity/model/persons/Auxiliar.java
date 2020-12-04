package com.solvd.projectUniversity.model.persons;

import java.util.Date;

import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.Room;

public class Auxiliar extends Employee {

	
	public Auxiliar(String firstName, String surname, String email, int identification, double salary, Date paymentDate) {
		super(firstName, surname, email, identification, salary,paymentDate);
		// TODO Auto-generated constructor stub
	}

	public void cleanTheRoom(Room r) {
		
	}


}
