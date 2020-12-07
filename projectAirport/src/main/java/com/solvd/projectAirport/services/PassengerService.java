package com.solvd.projectAirport.services;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IIdentificationDAO;
import com.solvd.projectAirport.dao.IPassengerDAO;
import com.solvd.projectAirport.dao.IPassengerIdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.IdentificationDAO;
import com.solvd.projectAirport.dao.jdbc.PassengerDAO;
import com.solvd.projectAirport.dao.jdbc.PassengerIdentificationDAO;
import com.solvd.projectAirport.model.Passenger;

public class PassengerService {
	private IPassengerDAO passengerDao = new PassengerDAO();
	private IIdentificationDAO identificationDao = new IdentificationDAO();
	private IPassengerIdentificationDAO pidentificationDao = new PassengerIdentificationDAO();
	private Logger log = LogManager.getLogger(PassengerService.class);

	public Passenger getById(long id) {
		Passenger p = passengerDao.getById(id);
		if(p!=null) {
			for (Long l : pidentificationDao.getIdentificationsFromPassengerId(id)){
				p.addIdentification(identificationDao.getById(l));
			}
		}else {
			log.error("The passenger with id: "+id+" does not exist");
		}
		return p;
	};

}
