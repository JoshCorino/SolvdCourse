package com.solvd.projectUniversity.interfaces;

import com.solvd.projectUniversity.model.persons.Person;
import com.solvd.projectUniversity.model.university.Departament;
import com.solvd.projectUniversity.model.university.Room;

@FunctionalInterface
public interface IMakeMeeting {
	public void makeMeeting(Room r, String description, Person organizer, Departament departament);
}
