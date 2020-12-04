package com.solvd.projectUniversity.model.university;

import java.util.Date;

public class Course {
	private String name;
	private String description;
	private Date startDate;
	
	public Course(String name, String description, Date startDate) {
		this.description=description;
		this.name=name;
		this.startDate=startDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
}
