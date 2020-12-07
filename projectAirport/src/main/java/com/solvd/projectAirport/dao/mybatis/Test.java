package com.solvd.projectAirport.dao.mybatis;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.model.Airline;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;
import com.solvd.projectAirport.model.Plane;

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
		
		log.info("Getting all the cities by country id 1");
		log.info(cityDAO.getCitiesByCountryId(1).toString());
		log.info("Testing MyBatis finished");
		
		log.info("Deleting the city 1 saved");
		cityDAO.remove(1);
		log.info("Deleting the city 2 saved");
		cityDAO.remove(2);
		log.info("Deleting the city 3 saved");
		cityDAO.remove(3);
		log.info("Deleting the country saved");
		countryDAO.remove(1);
		
		Airline a= new Airline();
		a.setId(1);
		a.setContact("airline@gmail.com");
		a.setName("Luftansa");
		
		Plane p = new Plane();
		p.setAirline(a);
		p.setId(1);
		p.setFuelCapacity(123d);
		p.setPassengersCapacity(100);
		p.setModel("Boing 747");
		
		AirlineDAO aDAO = new AirlineDAO();
		aDAO.save(a);
		
		PlaneDAO pDAO = new PlaneDAO();
		pDAO.save(p);
		
		log.info("Getting the plane 1 saved");
		log.info(pDAO.getById(1).toString());
		
		log.info("Testing MyBatis finished");
	}
}
