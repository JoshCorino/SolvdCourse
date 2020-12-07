package com.solvd.projectAirport.dao.mybatis;

import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.model.Country;

public class CountryDAO extends MyBatisDAO implements ICountryDAO{
	ICountryDAO dao = sqlSessionFactory.openSession(true).getMapper(ICountryDAO.class);

	@Override
	public Country save(Country c) {
		dao.save(c);
		return c;
	}

	@Override
	public Country getById(long id) {
		if(dao.getById(id)!=null)
			return dao.getById(id);
		return new Country();
	}

	@Override
	public void remove(long id) {
		dao.remove(id);
	
	}

}
