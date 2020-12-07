package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IInmigrationLogDAO;
import com.solvd.projectAirport.model.InmigrationLog;

public class InmigrationLogDAO extends MySQLDAO implements IInmigrationLogDAO{

	@Override
	public InmigrationLog save(InmigrationLog il) {
		// TODO Auto-generated method stub
		return il;
	}

	@Override
	public InmigrationLog getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
