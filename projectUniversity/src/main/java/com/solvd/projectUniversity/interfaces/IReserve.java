package com.solvd.projectUniversity.interfaces;

import com.solvd.projectUniversity.model.persons.Professor;
import com.solvd.projectUniversity.model.university.Build;
import com.solvd.projectUniversity.model.university.Room;

@FunctionalInterface
public interface IReserve {

	public void reserveRoom(Professor p, Room r);
	
}
