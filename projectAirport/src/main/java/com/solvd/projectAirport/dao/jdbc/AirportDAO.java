package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IAirportDAO;
import com.solvd.projectAirport.model.Airport;

public class AirportDAO extends MySQLDAO implements IAirportDAO{

	@Override
	public Airport save(Airport a) {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public Airport getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
