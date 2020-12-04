package com.solvd.projectAirport.dao;


import com.solvd.projectAirport.model.Identification;

public interface IIdentificationDAO extends IGenericDAO<Identification>{

	public long getCountryIdById(long id);
 }
