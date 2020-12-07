package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IGateDAO;
import com.solvd.projectAirport.model.Gate;

public class GateDAO extends MySQLDAO implements IGateDAO{

	@Override
	public Gate save(Gate g) {
		// TODO Auto-generated method stub
		return g;
	}

	@Override
	public Gate getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
