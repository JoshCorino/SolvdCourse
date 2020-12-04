package com.solvd.projectAirport.dao.mysql;

import com.solvd.projectAirport.dao.IHangarDAO;
import com.solvd.projectAirport.model.Hangar;

public class HangarDAO extends MySQLDAO implements IHangarDAO{

	@Override
	public Hangar save(Hangar h) {
		// TODO Auto-generated method stub
		return h;
	}

	@Override
	public Hangar getById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remove(long id) {
		// TODO Auto-generated method stub
		
	}

}
