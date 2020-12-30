package com.solvd.projectAirport.services;


import java.sql.Date;
import java.util.Calendar;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IIdentificationDAO;
import com.solvd.projectAirport.dao.IPassengerDAO;
import com.solvd.projectAirport.dao.IPassengerIdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.IdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.PassengerDAO;
import com.solvd.projectAirport.dao.jdbc.PassengerIdentificationDAO;
import com.solvd.projectAirport.model.Identification;
import com.solvd.projectAirport.model.Passenger;
import com.solvd.projectAirport.model.PassengerIdentification;

public class PassengerService {
	private IPassengerDAO passengerDao = new PassengerDAO();
	private IIdentificationDAO identificationDao = new IdentificationDAO();
	private IPassengerIdentificationDAO pidentificationDao = new PassengerIdentificationDAO();
	private Logger log = LogManager.getLogger(PassengerService.class);

	public Optional<Passenger> getById(long id) {
		Passenger p = passengerDao.getById(id);
		if(p!=null) {
			for (Long l : pidentificationDao.getIdentificationsFromPassengerId(id)){
				p.addIdentification(identificationDao.getById(l));
			}
		}else {
			log.error("The passenger with id: "+id+" does not exist");
		}
		return Optional.of(p);

	};
	
	public Optional<Passenger> save(Passenger c) {
		Passenger result = passengerDao.save(c);
		if(result!= null) {
			for (Identification i : c.getIdentifications()) {
				identificationDao.save(i);
				pidentificationDao.save(new PassengerIdentification(c.getId(),i.getId(),new Date(Calendar.getInstance().getTime().getTime())));
			}
		}
		return Optional.of(result);

	}

}
