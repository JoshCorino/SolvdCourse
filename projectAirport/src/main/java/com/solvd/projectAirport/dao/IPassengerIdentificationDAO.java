package com.solvd.projectAirport.dao;

import java.util.ArrayList;

import com.solvd.projectAirport.model.PassengerIdentification;

public interface IPassengerIdentificationDAO extends IGenericDAO<PassengerIdentification>{

	public ArrayList<Long> getIdentificationsFromPassengerId(long id);
}
