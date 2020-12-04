package com.solvd.projectUniversity.exceptions;

public class PriceZeroException extends Exception {

	public PriceZeroException() {
		super("The price can't be zero");
	}
	
}
