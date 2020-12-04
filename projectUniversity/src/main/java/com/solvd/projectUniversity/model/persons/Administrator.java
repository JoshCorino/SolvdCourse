package com.solvd.projectUniversity.model.persons;

import java.util.Date;

import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;
import com.solvd.projectUniversity.interfaces.IContact;
import com.solvd.projectUniversity.interfaces.IDelete;
import com.solvd.projectUniversity.interfaces.IReport;
import com.solvd.projectUniversity.interfaces.IReserve;
import com.solvd.projectUniversity.model.university.Course;
import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.Room;
import com.solvd.projectUniversity.model.university.University;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Administrator extends Employee implements   IDelete{

	private University university;
	private Logger log = LogManager.getLogger(Administrator.class);
	private int idDepartament;

	public Administrator(String firstName, String surname, String email, int identification, double salary, int idDepartament, University university,Date paymentDate) {
		super(firstName, surname, email, identification, salary,paymentDate);
		this.university=university;
		this.idDepartament=idDepartament;
		// TODO Auto-generated constructor stub
	}
	public void createCourse(Departament d, String courseName, String courseDesc, Date startDate) {
		//Create course and add it to d
		d.addCourse(new Course(courseName,courseDesc,startDate));
	}
	public void deleteCourse() {
		//Delete course from d
	}
	public void addCourse(Student s,Departament d, String courseName) {
		
		try {
			s.addSignedCourse(d.getCourse(courseName));
		} catch (CourseDoesNotExistException e) {
			// TODO Auto-generated catch block
			log.error("The deparament"+d+" hasn't one curse with name "+courseName,e);
		}
	}
	public void addCourse(Professor professor, Departament departament, String courseName) {
		// TODO Auto-generated method stub
		
		try {
			professor.addCourse(departament.getCourse(courseName));
		} catch (CourseDoesNotExistException e) {
			// TODO Auto-generated catch block
			log.error("The deparament"+departament+" hasn't one curse with name "+courseName,e);
		}
	}
	
	
	public void generateReport(String name, IReport<University> i) {
		i.generateReport(name,university,this);
	}
	
	
	public void reserveRoom(Professor p, Room r, IReserve i) {
		// TODO Auto-generated method stub
		i.reserveRoom(p,r);
	}
	
	
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	public void contact(Student s, String message, Professor p, IContact<Student, String, Professor> i) {
		// TODO Auto-generated method stub
		i.contact(s, message, p);
	}

}
