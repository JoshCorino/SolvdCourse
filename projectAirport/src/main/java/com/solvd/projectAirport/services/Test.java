package com.solvd.projectAirport.services;

import java.sql.Date;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.*;
import com.solvd.projectAirport.dao.jdbc.*;
import com.solvd.projectAirport.model.*;

public class Test {
	
	public static void main( String[] args ){
		Logger log = LogManager.getLogger(PassengerDAO.class);

		Passenger p = new Passenger(1, "Joshua", "Corino", new ArrayList<Identification>());
		Country c = new Country(1, "Argentina", new ArrayList<City>());
		Identification i = new Identification(1, "Passport", "Passport from china", c);
		PassengerIdentification pi = new PassengerIdentification( 1, 1, new Date(0));
		City c1 = new City(0, "Buenos Aires",1);
		City c2 = new City(0, "Mar del plata",1);
		City c3 = new City(0, "Tandil",1);
		EmployeeType et = new EmployeeType(1, "Driver", "Drive trucks");
		Employee empl = new Employee(1, "John", "Tyrion", "224242342",et);
		
		i.setCountry(c);
		p.addIdentification(i);
		c.addCity(c1);
		c.addCity(c2);
		c.addCity(c3);
		empl.setType(et);
				
		log.info("Testing services");
		
		CountryService cs = new CountryService();
		cs.save(c);
		Country fullCountry = cs.getById(1).get();
		log.info("Country : "+fullCountry.toString()+" selected");
		
		PassengerService ps = new PassengerService();
		ps.save(p);
		Passenger fullPasenger = ps.getById(1).get();
		log.info("Passanger : "+fullPasenger.toString()+" selected");

		IdentificationService is = new IdentificationService();
		is.save(i);
		Identification fullIdentification = is.getById(1).get();
		log.info("Identification : "+fullIdentification.toString()+" selected");
		
		

		EmployeeService emps = new EmployeeService();
		emps.save(empl);
		Employee fullEmployee= emps.getById(1).get();
		log.info("Employee : "+fullEmployee.toString()+" selected");
		
		log.info("Services test finished");
		

    }

}
