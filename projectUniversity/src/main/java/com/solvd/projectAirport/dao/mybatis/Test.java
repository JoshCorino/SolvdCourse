package com.solvd.projectAirport.dao.mybatis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;

public class Test {
	public static void main( String[] args ){
		
		Logger log = LogManager.getLogger(Test.class);
		
		log.info("Testing insert and select MyBatis");
		
		Country c = new Country(1, "Argentina", null);
		CountryDAO countryDAO = new CountryDAO();
		countryDAO.save(c);
		
		City c1 = new City(0, "Buenos Aires",1);
		City c2 = new City(0, "Mar del plata",1);
		City c3 = new City(0, "Tandil",1);
		CityDAO cityDAO = new CityDAO();
		cityDAO.save(c1);
		cityDAO.save(c2);
		cityDAO.save(c3);
		
		log.info("Getting the country saved");
		log.info(countryDAO.getById(1).toString());
		log.info("Getting the city 1 saved");
		log.info(cityDAO.getById(1).toString());
		log.info("Getting the city 2 saved");
		log.info(cityDAO.getById(2).toString());
		log.info("Getting the city 3 saved");
		log.info(cityDAO.getById(3).toString());
		log.info("Testing MyBatis finished");
		
		log.info("Deleting the city 1 saved");
		cityDAO.remove(1);
		log.info("Deleting the city 2 saved");
		cityDAO.remove(2);
		log.info("Deleting the city 3 saved");
		cityDAO.remove(3);
		log.info("Deleting the country saved");
		countryDAO.remove(1);
		
		log.info("Testing MyBatis finished");
	}
}
