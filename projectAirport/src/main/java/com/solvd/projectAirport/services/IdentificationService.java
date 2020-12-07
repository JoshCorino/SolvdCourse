package com.solvd.projectAirport.services;

import com.solvd.projectAirport.dao.ICountryDAO;
import com.solvd.projectAirport.dao.IIdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.CountryDAO;
import com.solvd.projectAirport.dao.jdbc.IdentificationDAO;
import com.solvd.projectAirport.model.Identification;

public class IdentificationService {
	IIdentificationDAO identificationDAO = new IdentificationDAO();
	ICountryDAO countryDAO = new CountryDAO();
	
	public Identification getById(long id) {
		Identification result = identificationDAO.getById(id);
		result.setCountry(countryDAO.getById(identificationDAO.getCountryIdById(id)));
		return result;
	}
}
