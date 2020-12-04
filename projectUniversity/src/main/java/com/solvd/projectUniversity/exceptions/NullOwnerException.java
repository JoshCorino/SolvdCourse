package com.solvd.projectUniversity.exceptions;

public class NullOwnerException extends Exception {
	public NullOwnerException() {
		super("The owner can't be null");
	}
}
