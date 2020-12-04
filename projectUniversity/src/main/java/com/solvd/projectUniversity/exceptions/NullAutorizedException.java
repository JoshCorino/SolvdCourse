package com.solvd.projectUniversity.exceptions;

public class NullAutorizedException extends Exception {


	public NullAutorizedException() {
		super("The autorized can't be null");
	}
}
