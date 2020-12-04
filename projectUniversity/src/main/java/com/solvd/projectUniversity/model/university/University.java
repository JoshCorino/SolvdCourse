package com.solvd.projectUniversity.model.university;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.solvd.projectUniversity.interfaces.IReserve;
import com.solvd.projectUniversity.model.persons.Person;
import com.solvd.projectUniversity.model.persons.Professor;

public class University {
	
	private String name;
	private List<Departament> departaments;
	private List<Build> builds;
	private List<Report> reports;
	private Date foundationDate;

	
	public University(String name) {
		this.name=name;
		departaments= new ArrayList<Departament>();
		builds= new ArrayList<Build>();
		reports= new ArrayList<Report>();
		foundationDate= Calendar.getInstance().getTime();

	}
	

	
	public void addDepartament(Departament p) {
		departaments.add(p);
	}
	
	public void removeDepartament(int index) {
		if(index<departaments.size()) departaments.remove(index);
	}

	
	public void addBuild(Build p) {
		builds.add(p);
	}
	
	public void removeBuild(int index) {
		if(index<builds.size()) builds.remove(index);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	public void addReport(Report report) {
		// TODO Auto-generated method stub
		
	}

	
	
}
