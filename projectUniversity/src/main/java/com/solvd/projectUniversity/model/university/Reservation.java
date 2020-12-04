package com.solvd.projectUniversity.model.university;

import java.util.Date;

import com.solvd.projectUniversity.model.persons.*;

public class Reservation {
	Date start;
	Date end;
	Professor professor;
	
	public Reservation(Date start, Date end, Professor professor) {
		super();
		this.start = start;
		this.end = end;
		this.professor = professor;
	}
	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	public Professor getProfessor() {
		return professor;
	}
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	
}
