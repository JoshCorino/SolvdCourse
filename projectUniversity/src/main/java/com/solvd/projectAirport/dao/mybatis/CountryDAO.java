package com.solvd.projectAirport.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.ICityDAO;
import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;

public class CountryDAO implements ICountryDAO{
	private Logger log = LogManager.getLogger(CountryDAO.class);

	@Override
	public Country save(Country g) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICountryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICountryDAO.class);
			
			bhDao.save(g);
			
		} catch (IOException e) {
			log.error(e);
		}
		return g;
	}

	@Override
	public Country getById(long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICountryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICountryDAO.class);
			if(bhDao.getById(id)!=null)
				return bhDao.getById(id);
			
		} catch (IOException e) {
			log.error(e);
		}
		return new Country();
	}

	@Override
	public void remove(long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICountryDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICountryDAO.class);
			
			bhDao.remove(id);
			
		} catch (IOException e) {
			log.error(e);
		}
		
	}

}
