package com.solvd.projectAirport.dao.mysql;

import com.solvd.projectAirport.dao.IPilotDAO;
import com.solvd.projectAirport.model.Pilot;

public class PilotDAO extends MySQLDAO implements IPilotDAO{

	@Override
	public Pilot save(Pilot p) {
		// TODO Auto-generated method stub
		return p;
	}

	@Override
	public Pilot getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
