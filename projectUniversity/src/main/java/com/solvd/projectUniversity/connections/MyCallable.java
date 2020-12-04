package com.solvd.projectUniversity.connections;

import java.util.concurrent.Callable;


public class MyCallable<T> implements Callable<String>{

	private String str;
	
	public MyCallable(String str) {
		this.str = str;
	}

	@Override
	public String call() throws Exception {
		return str;
	}

}
