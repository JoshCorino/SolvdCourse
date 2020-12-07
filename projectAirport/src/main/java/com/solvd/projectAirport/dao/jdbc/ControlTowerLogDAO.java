package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.dao.IControlTowerLogDAO;
import com.solvd.projectAirport.model.ControlTowerLog;

public class ControlTowerLogDAO extends MySQLDAO implements IControlTowerLogDAO{

	@Override
	public ControlTowerLog save(ControlTowerLog ctl) {
		// TODO Auto-generated method stub
		
		return ctl;
	}

	@Override
	public com.solvd.projectAirport.model.ControlTowerLog getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
