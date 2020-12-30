package com.solvd.projectAirport.services;

import java.util.Optional;

import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.dao.IIdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.CountryDAO;
import com.solvd.projectAirport.dao.jdbc.IdentificationDAO;
import com.solvd.projectAirport.model.Employee;
import com.solvd.projectAirport.model.Identification;

public class IdentificationService {
	IIdentificationDAO identificationDAO = new IdentificationDAO();
	ICountryDAO countryDAO = new CountryDAO();
	
	public Optional<Identification> getById(long id) {
		Identification result = identificationDAO.getById(id);
		if(result!= null) {
			result.setCountry(countryDAO.getById(identificationDAO.getCountryIdById(id)));
		}
		return Optional.of(result);
	}
	public Optional<Identification> save(Identification c) {
		Identification result = identificationDAO.save(c);
		if(result!= null) {
			countryDAO.save(c.getCountry());
		}
		return Optional.of(result);
	}
}
