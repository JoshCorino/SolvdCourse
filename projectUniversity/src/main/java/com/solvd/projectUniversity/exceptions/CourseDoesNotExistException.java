package com.solvd.projectUniversity.exceptions;

public class CourseDoesNotExistException extends Exception {
	public CourseDoesNotExistException() {
		super("The course does not exists");
	}
}
