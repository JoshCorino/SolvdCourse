package com.solvd.projectAirport.dao.mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.ICityDAO;
import com.solvd.projectAirport.model.City;

public class CityDAO implements ICityDAO{
	private Logger log = LogManager.getLogger(CityDAO.class);


	@Override
	public City save(City g) {

		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICityDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICityDAO.class);
			
			bhDao.save(g);
			
		} catch (IOException e) {
			log.error(e);
		}
		return g;
		
	}

	@Override
	public City getById(long id) {

		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICityDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICityDAO.class);
			if(bhDao.getById(id)!=null)
				return bhDao.getById(id);
			
		} catch (IOException e) {
			log.error(e);
		}
		return new City();
	}

	@Override
	public void remove(long id) {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

			ICityDAO bhDao = sqlSessionFactory.openSession(true).getMapper(ICityDAO.class);
			
			bhDao.remove(id);
			
		} catch (IOException e) {
			log.error(e);
		}
		
	}

	@Override
	public ArrayList<City> getCitiesByCountryId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
