package com.solvd.projectUniversity.exceptions;

public class RoomDoesNotExistException extends Exception {
	public RoomDoesNotExistException() {
		super("The room does not exists");
	}
}
