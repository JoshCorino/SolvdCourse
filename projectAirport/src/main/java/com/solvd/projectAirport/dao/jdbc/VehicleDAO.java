package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IVehicleDAO;
import com.solvd.projectAirport.model.Vehicle;

public class VehicleDAO extends MySQLDAO implements IVehicleDAO{

	@Override
	public Vehicle save(Vehicle v) {
		// TODO Auto-generated method stub
		return v;
	}

	@Override
	public Vehicle getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
