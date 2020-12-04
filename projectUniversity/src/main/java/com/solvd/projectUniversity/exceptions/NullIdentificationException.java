package com.solvd.projectUniversity.exceptions;

public class NullIdentificationException extends Exception {
	public NullIdentificationException() {
		super("The identification number can't be null");
	}
}
