package com.solvd.projectUniversity.model.university;

import java.util.ArrayList;
import java.util.List;

import com.solvd.projectUniversity.exceptions.CourseDoesNotExistException;
import com.solvd.projectUniversity.exceptions.NullOwnerException;

public class ExclusiveBuild extends Build {

	private List<ExclusiveRoom> rooms;
	private Departament owner;
	
	public ExclusiveBuild(String name, String localization, String description, Departament owner) throws NullOwnerException {
		super(name, localization, description);
		this.setOwner(owner);
		rooms=new ArrayList<ExclusiveRoom>();

	}

	@Override
	public void addRoom(Room r) {
		// TODO Auto-generated method stub
		rooms.add((ExclusiveRoom) r);
	}

	@Override
	public boolean deleteRoom(String roomName) {
		// TODO Auto-generated method stub
		rooms.removeIf(r->r.getName().equals(roomName));
		return true;
	}

	@Override
	public int numOfRooms() {

		return rooms.size();
	}


	/**
	 * @return the owner
	 */
	public Departament getOwner() {
		return owner;
	}


	/**
	 * @param owner the owner to set
	 */
	public void setOwner(Departament owner) throws NullOwnerException{
		if(owner==null) {
			throw new NullOwnerException();
		}
		this.owner = owner;
	}
	
	public Room getRoom(String roomName) throws CourseDoesNotExistException {
		for (ExclusiveRoom exclusiveRoom : rooms) {
			if(exclusiveRoom.getName().equals(roomName)) {
				return exclusiveRoom;
			}
		}
		throw new CourseDoesNotExistException();
	}
	
}

