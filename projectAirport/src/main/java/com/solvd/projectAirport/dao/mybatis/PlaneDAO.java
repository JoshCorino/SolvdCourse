package com.solvd.projectAirport.dao.mybatis;

import java.util.ArrayList;

import com.solvd.projectAirport.dao.IPlaneDAO;
import com.solvd.projectAirport.model.Plane;

public class PlaneDAO extends MyBatisDAO implements IPlaneDAO{
	private IPlaneDAO dao = sqlSessionFactory.openSession(true).getMapper(IPlaneDAO.class);

	@Override
	public Plane save(Plane p) {
		dao.save(p);
		return p;
	}

	@Override
	public Plane getById(long id) {
		if(dao.getById(id)!=null)
			return dao.getById(id);
		return new Plane();
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
	}

	@Override
	public ArrayList<Plane> getPlanesByAirlineId(long id) {
		if(dao.getPlanesByAirlineId(id)!=null)
			return dao.getPlanesByAirlineId(id);
		return new ArrayList<Plane>();
	}



}
