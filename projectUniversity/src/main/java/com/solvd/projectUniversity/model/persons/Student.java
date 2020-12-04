package com.solvd.projectUniversity.model.persons;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectUniversity.enumerate.Days;
import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;
import com.solvd.projectUniversity.interfaces.IMakeMeeting;
import com.solvd.projectUniversity.interfaces.IReport;
import com.solvd.projectUniversity.model.Main;
import com.solvd.projectUniversity.model.university.Course;
import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.Message;
import com.solvd.projectUniversity.model.university.Report;
import com.solvd.projectUniversity.model.university.Room;
import com.solvd.projectUniversity.model.university.University;

public class Student extends Person{
	
	private List<Course> signedCourses;
	private List<Course> approvedCourses;
	private List<Days> daysWithClasses;
	private List<Message> messages;
	private Logger log = LogManager.getLogger(Student.class);

	public Student(String firstName, String surname, String email, int identification) {
		super(firstName, surname, email, identification);
		this.signedCourses= new ArrayList<Course>();
		this.approvedCourses= new ArrayList<Course>();
		this.daysWithClasses= new ArrayList<Days>();
		this.messages= new ArrayList<Message>();
	}
	
	
	public void addSignedCourse(Course p) {
		signedCourses.add(p);
	}
	
	
	public void addApprovedCourse(Course p) {
		approvedCourses.add(p);
	}
	
	public void addDayOfClass(Days p) {
		daysWithClasses.add(p);
	}

	public void deleteSignedCourse(Course p) {
		if(signedCourses.contains(p)) {
			signedCourses.remove(p);
		}
	}
	public boolean approveCourse(Course c) throws CourseDoesNotExistException{
		if(signedCourses.contains(c)){
			addApprovedCourse(c);
			return true;
		}
		throw new CourseDoesNotExistException();
		
	}

	
	public void makeMeeting(Room r, String description, Departament departament, IMakeMeeting i) {
		i.makeMeeting(r, description,this,departament);
	}
	
	public void generateReport(String name, Departament dep, IReport<Departament> i) {
		i.generateReport(name,dep,this);
	}



	public boolean addMsj(Professor emitter, String message) {
		messages.add(new Message<Professor, Student>(emitter,this,message));
		return true;
	};
	
	public void showMessages() {
		
		messages.forEach(m -> log.info(m.getMessage()));
	}
}
