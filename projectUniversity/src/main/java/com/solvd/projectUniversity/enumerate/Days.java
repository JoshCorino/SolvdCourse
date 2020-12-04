package com.solvd.projectUniversity.enumerate;

public enum Days {
	SUNDAY("Sunday", true),
	MONDAY("Monday"),
	THUESDAY("Thuesday"),
	WEDNESDAY("Wednesday"),
	THURSDAY("Thursday"),
	FRIDAY("Friday"),
	SATURDAY("Saturday", true);
		
	private String daysNames;
	private boolean isWeekend;
	
	private Days(String name) {
		this.daysNames=name;
		this.isWeekend=false;
	}

	private Days(String name, boolean isWeekend) {
		this.daysNames=name;
		this.isWeekend=isWeekend;
	}

	public String getDaysNames() {
		return daysNames;
	}

	public boolean isWeekend() {
		return isWeekend;
	}
}
