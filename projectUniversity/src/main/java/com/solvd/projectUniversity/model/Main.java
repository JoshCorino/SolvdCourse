package com.solvd.projectUniversity.model;

import java.util.ArrayList;
import java.util.Calendar;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectUniversity.connections.Test;
import com.solvd.projectUniversity.enumerate.RoomsCapacities;
import com.solvd.projectUniversity.exceptions.PriceZeroException;
import com.solvd.projectUniversity.filters.IGenericFilter;
import com.solvd.projectUniversity.model.persons.Administrator;
import com.solvd.projectUniversity.model.persons.Professor;
import com.solvd.projectUniversity.model.persons.Student;
import com.solvd.projectUniversity.model.persons.Person;
import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.PaidUniversity;
import com.solvd.projectUniversity.model.university.University;
import com.solvd.projectUniversity.model.university.Build;
import com.solvd.projectUniversity.model.university.Course;
import com.solvd.projectUniversity.model.university.Report;
import com.solvd.projectUniversity.model.university.Reservation;
import com.solvd.projectUniversity.model.university.Room;
import com.solvd.projectUniversity.model.university.SharedBuild;


public class Main {

	

	public static void main( String[] args ){
		
		Logger log = LogManager.getLogger(Main.class);
		
		University university= new University("UniversityDemo");
		Administrator administrator= new Administrator("John", "Travolta", "johnt@gmail.com", 3, 1234,0, university, Calendar.getInstance().getTime());
		Departament departament = new Departament("Computer science", administrator, new ArrayList<Professor>(), new ArrayList<Student>(), new ArrayList<Course>(), new ArrayList<Report>());
		Professor professor= new Professor("Juan", "Perez", "juanp@gmail.com", 1, 110, Calendar.getInstance().getTime());
	    Student student= new Student("Erick", "Hill", "erickh@gmail.com", 2);
	    
	    
	    university.addDepartament(departament);
	    departament.addProfessor(professor);
	    departament.addStudent(student);
		departament.setAdmin(administrator);
		
		//It is possible to create the course outside the administrator but that the administrator administers it is more real
		administrator.createCourse(departament, "Python", "Systems engineer course", Calendar.getInstance().getTime());
		administrator.addCourse(student, departament, "Python");
		administrator.addCourse(professor, departament, "Python");
		
		if(professor.approveCourse("Python", student)) {
			log.info("The student: "+student.getFirstName()+" is expert in Python. He graduated in the university "+university.getName()+" at "+ Calendar.getInstance().getTime().toString());
		}else {
			log.info("The student: "+student.getFirstName()+" isn't expert in Python");
		};
		
		//Demo of casting
		try {
			University universityDemo= new PaidUniversity("UniversityDemo",10);
			PaidUniversity paidUniversityDemo = (PaidUniversity) universityDemo;
			paidUniversityDemo.getQuota();
		} catch (PriceZeroException e) {
			// TODO Auto-generated catch block
			log.error("The quota can't be zero",e);
		}
		
		//Example filter lambda
		
		IGenericFilter<Student,String> filterStudentByName = (stu, name) -> {
			return stu.getFirstName().equals(name);
		};
		
		log.info("The students firstName is Erick: "+filterStudentByName.satisfy(student, "Erick"));
		log.info("The students firstName is John: "+filterStudentByName.satisfy(student, "John"));
		
		//Example contact lambda
		
		administrator.contact(student, "Demo message", professor, (receiver,message, emitter)-> {
			receiver.addMsj(emitter,message);
		});
		student.showMessages();
		
		
		//Example make meeting lambda
		
		Room r =new Room("Lab", RoomsCapacities.CLASSROOM_FIFTY);
		student.makeMeeting(r, "Meeting at 8am", departament, (room, desc, organizer, dep)-> {dep.addMeeting(room, desc, organizer);});
		
		
		//Example generate report 
		
		student.generateReport("Report demo", departament, (name, destiny, emitter)-> {destiny.addReport(new Report<Person>(name, emitter));});
		
		//Example reserve room
		
		administrator.reserveRoom(professor, r, (prof, room)-> {room.addReserve(new Reservation(null, null, prof));});
    }

}
