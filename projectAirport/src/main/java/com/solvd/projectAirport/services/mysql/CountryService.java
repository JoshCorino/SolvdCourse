package com.solvd.projectAirport.services.mysql;

import com.solvd.projectAirport.dao.ICityDAO;
import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.dao.mysql.CityDAO;
import com.solvd.projectAirport.dao.mysql.CountryDAO;
import com.solvd.projectAirport.model.Country;

public class CountryService {
	ICountryDAO countryDAO = new CountryDAO();
	ICityDAO cityDAO = new CityDAO();
	
	public Country getById(long id) {
		Country c = countryDAO.getById(id);
		c.addCities(cityDAO.getCitiesByCountryId(id));
		return c;
	}
}
