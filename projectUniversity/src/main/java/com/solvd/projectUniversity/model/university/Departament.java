package com.solvd.projectUniversity.model.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;
import com.solvd.projectUniversity.model.persons.Administrator;
import com.solvd.projectUniversity.model.persons.Person;
import com.solvd.projectUniversity.model.persons.Professor;
import com.solvd.projectUniversity.model.persons.Student;


public class Departament{
	
	private String name;
	private Administrator admin;
	private List<Professor> professors;
	private List<Student> students;
	private List<Course> courses;
	private List<Report> reports;
	
	private static final int INCREMENT = 5;

	
	
	public Departament(String name, Administrator admin, ArrayList<Professor> professors, ArrayList<Student> students, ArrayList<Course> courses, ArrayList<Report> reports) {
		this.name = name;
		this.admin = admin;
		this.professors = professors;
		this.students = students;
		this.courses = courses;
		this.reports = reports;
	}



	@Override
	public int hashCode() {
		return Objects.hash(name,admin,professors,courses);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null) return false;
		
		if(!(obj instanceof Departament)) return false;
		
		Departament d = (Departament)obj;
		
		if(d.hashCode() != this.hashCode()) return false;
		
		if(d.getAdmin()==admin && d.getName()==name) return true; //It's possible check of arrays too but is unnecessary
		
		return false;

	}
	public boolean haveProfessor(Professor p) {
		return professors.contains(p);
	}
	
	public void addProfessor(Professor p) {
		professors.add(p);
	}
	
	public void removeProfessor(int index) {
		if(index< professors.size()) {
			professors.remove(index);
		}
	}
	
	public boolean haveCourse(Course p) {
		return courses.contains(p);
	}
	
	
	public void addCourse(Course p) {
		courses.add(p);
	}
	
	public Course getCourse(String courseName) throws CourseDoesNotExistException {

		for (Course course : courses) {
			if(course.getName().equals(courseName)) return course;
		}
		throw new CourseDoesNotExistException();

	}
	public void removeCourse(int index) {
		//
	}
	/**
	 * @return the admin
	 */
	public Administrator getAdmin() {
		return admin;
	}
	/**
	 * @param admin the admin to set
	 */
	public void setAdmin(Administrator admin) {
		this.admin = admin;
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

	public void addStudent(Student student) {
		students.add(student);
		
	}

	public void addReport(Report report) {
		// TODO Auto-generated method stub
		reports.add(report);
	}



	public void addMeeting(Room room, String desc, Person organizer) {
		// TODO Auto-generated method stub
		
	}



}
