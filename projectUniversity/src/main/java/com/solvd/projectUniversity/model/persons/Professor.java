package com.solvd.projectUniversity.model.persons;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.solvd.projectUniversity.enumerate.Days;
import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;
import com.solvd.projectUniversity.interfaces.IContact;
import com.solvd.projectUniversity.interfaces.IMakeMeeting;
import com.solvd.projectUniversity.interfaces.IReport;
import com.solvd.projectUniversity.interfaces.IReserve;
import com.solvd.projectUniversity.model.university.Build;
import com.solvd.projectUniversity.model.university.Course;
import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.Report;
import com.solvd.projectUniversity.model.university.Room;
import com.solvd.projectUniversity.model.university.University;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Professor extends Employee implements  IReserve{
	
	private List<Course> assignedCourses;
	private List<Days> daysWithClasses;
	private Logger log = LogManager.getLogger(Professor.class);

	public Professor(String firstName, String surname, String email, int identification, double salary, Date paymentDate) {
		super(firstName, surname, email, identification, salary,paymentDate);
		assignedCourses= new ArrayList<Course>();
	}

	public void addDayOfClass(Days p) {
		daysWithClasses.add(p);
	}
	
	public void addCourse(Course p) {
		assignedCourses.add(p);
	}
	public boolean approveCourse(String courseName, Student s) {
		

		for (Course course : assignedCourses) {
				if(course.getName().equals(courseName)) {
					try {
						if(s.approveCourse(course))	return true;
					} catch (CourseDoesNotExistException e) {
						// TODO Auto-generated catch block
						log.error("The student is not registered in the course  "+courseName,e);
					}
				}
		}
		return false;
	}

	
	public void makeMeeting(Room r, String description, Departament dep, IMakeMeeting i) {
		i.makeMeeting(r, description,this,dep);
	}
	
	public void generateReport(String name, Departament dep, IReport<Departament> i) {
		i.generateReport(name,dep,this);
	}

	
	public void contact(Student s, String message, IContact<Student, String, Person> i) {
		// TODO Auto-generated method stub
		i.contact(s, message, this);
	}

	@Override
	public void reserveRoom(Professor p, Room r) {
		// TODO Auto-generated method stub
		
	}


}
