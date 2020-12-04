package com.solvd.projectUniversity.model.university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;

public class SharedBuild extends Build {


	private List<Room> rooms;
	
	public SharedBuild(String name, String localization, String description) {
		super(name, localization, description);
		rooms=new ArrayList<Room>();
	}

	@Override
	public void addRoom(Room r) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean deleteRoom(String roomName) {
		// TODO Auto-generated method stub
		rooms.removeIf(r->r.getName().equals(roomName));
		return true;
	}

	@Override
	public int numOfRooms() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Room getRoom(String roomName) throws CourseDoesNotExistException {
		for (Room exclusiveRoom : rooms) {
			if(exclusiveRoom.getName().equals(roomName)) {
				return exclusiveRoom;
			}
		}
		throw new CourseDoesNotExistException();
	}
}
