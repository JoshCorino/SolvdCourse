package com.solvd.projectAirport.services;

import java.util.Optional;

import com.solvd.projectAirport.dao.ICityDAO;
import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.dao.jdbc.CityDAO;
import com.solvd.projectAirport.dao.jdbc.CountryDAO;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;

public class CountryService {
	ICountryDAO countryDAO = new CountryDAO();
	ICityDAO cityDAO = new CityDAO();
	
	public Optional<Country> getById(long id) {
		Country c = countryDAO.getById(id);
		if(c!= null) {
			c.addCities(cityDAO.getCitiesByCountryId(id));
		}
		return Optional.of(c);
	}
	
	public Optional<Country> save(Country c) {
		Country result = countryDAO.save(c);
		if(result!= null) {
			for (City city : c.getCities()) {
				cityDAO.save(city);
			}
		}
		return Optional.of(c);
	}
}
