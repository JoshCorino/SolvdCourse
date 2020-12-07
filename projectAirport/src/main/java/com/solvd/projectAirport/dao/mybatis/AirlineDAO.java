package com.solvd.projectAirport.dao.mybatis;

import com.solvd.projectAirport.dao.IAirlineDAO;
import com.solvd.projectAirport.model.Airline;

public class AirlineDAO extends MyBatisDAO implements IAirlineDAO{
	private IAirlineDAO dao = sqlSessionFactory.openSession(true).getMapper(IAirlineDAO.class);

	@Override
	public Airline save(Airline a) {
		dao.save(a);
		return a;
	}

	@Override
	public Airline getById(long id) {
		if(dao.getById(id)!=null)
			return dao.getById(id);
		return new Airline();
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
	}

}
