package com.solvd.projectUniversity.model.university;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.solvd.projectUniversity.enumerate.RoomsCapacities;
import com.solvd.projectUniversity.model.persons.*;
public class Room {
	private String name;
	private RoomsCapacities capacity;
	private List<Reservation> reserves;
	
	
	public Room(String name, RoomsCapacities capacity) {
		super();
		this.name = name;
		this.capacity = capacity;
		this.reserves=new ArrayList<Reservation>();
	}

	public boolean itIsAutorized(Professor d) {
		return true;
	}
	
	public void addReserve(Reservation r) {
		reserves.add(r);
	}
	@Override
	public String toString() {
		return "Room [name=" + name + ", capacity=" + capacity + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(name,capacity);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null) return false;
		
		if(!(obj instanceof Room)) return false;
		
		Room r = (Room)obj;
		
		if(r.hashCode() != this.hashCode()) return false;
		
		if(r.getCapacity()==capacity && r.getName()==name) return true;
		
		return false;

	}

	public boolean deleteReservation(Reservation r) {
		return false;
		//Check if stay reserved, delete
	}
	
	/**
	 * @return the capacity
	 */
	public RoomsCapacities getCapacity() {
		return capacity;
	}

	/**
	 * @param capacity the capacity to set
	 */
	public void setCapacity(RoomsCapacities capacity) {
		this.capacity = capacity;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
