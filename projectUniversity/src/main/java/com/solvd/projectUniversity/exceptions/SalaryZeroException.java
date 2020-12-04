package com.solvd.projectUniversity.exceptions;

public class SalaryZeroException extends Exception {
	public SalaryZeroException() {
		super("The salary number can't be zero");
	}
}
