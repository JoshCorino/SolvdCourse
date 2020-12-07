package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IFlightDAO;
import com.solvd.projectAirport.model.Flight;

public class FlightDAO extends MySQLDAO implements IFlightDAO{

	@Override
	public Flight save(Flight f) {
		// TODO Auto-generated method stub
		return f;
	}

	@Override
	public Flight getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
