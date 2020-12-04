package com.solvd.projectAirport.dao.mysql;

import java.sql.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IPassengerIdentificationDAO;
import com.solvd.projectAirport.model.Airline;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;
import com.solvd.projectAirport.model.Employee;
import com.solvd.projectAirport.model.EmployeeType;
import com.solvd.projectAirport.model.Identification;
import com.solvd.projectAirport.model.Passenger;
import com.solvd.projectAirport.model.PassengerIdentification;
import com.solvd.projectAirport.model.Plane;
import com.solvd.projectAirport.services.mysql.CountryService;
import com.solvd.projectAirport.services.mysql.EmployeeService;
import com.solvd.projectAirport.services.mysql.IdentificationService;
import com.solvd.projectAirport.services.mysql.PassengerService;
import com.solvd.projectAirport.services.mysql.PlaneService;

public class Test {
	
	public static void main( String[] args ){
		Logger log = LogManager.getLogger(Test.class);
		
		log.info("Testing insert and select mysql DAO");

		Passenger p = new Passenger(1, "Joshua", "Corino", null);
		PassengerDAO pd = new PassengerDAO();
		pd.save(p);
		Passenger pg = pd.getById(1);
		log.info("Passenger first name: "+pg.getFirstName());
		
		Country c = new Country(1, "Argentina", null);
		CountryDAO cd = new CountryDAO();
		cd.save(c);
		Country cg = cd.getById(1);
		log.info("Country name: "+cg.getName());
		
		Identification i = new Identification(1, "Passport", "Passport from china", c);
		IdentificationDAO id = new IdentificationDAO();
		id.save(i);
		Identification ig = id.getById(1);
		log.info("Identification description: "+ig.getDescription());
		
		PassengerIdentification pi = new PassengerIdentification(1, 1, 1, new Date(0));
		IPassengerIdentificationDAO pid = new PassengerIdentificationDAO();
		pid.save(pi);
		
		City c1 = new City(0, "Buenos Aires",1);
		City c2 = new City(0, "Mar del plata",1);
		City c3 = new City(0, "Tandil",1);
		CityDAO cityDAO = new CityDAO();
		cityDAO.save(c1);
		cityDAO.save(c2);
		cityDAO.save(c3);
		
		EmployeeType et = new EmployeeType(1, "Driver", "Drive trucks");
		EmployeeTypeDAO etDAO = new EmployeeTypeDAO();
		etDAO.save(et);
		
		Employee empl = new Employee(1, "John", "Tyrion", "224242342",et);
		EmployeeDAO emplDAO = new EmployeeDAO();
		emplDAO.save(empl);
		
		Airline air = new Airline(1,"Luftansa","luftansa@gmail.com");
		AirlineDAO airDAO = new AirlineDAO();
		airDAO.save(air);
		
		Plane plane = new Plane(0, "747", 300, 5000, air);
		PlaneDAO planeDAO = new PlaneDAO();
		planeDAO.save(plane);
		
		log.info("Testing services");
		
		PassengerService ps = new PassengerService();
		Passenger fullPasenger = ps.getById(1);
		log.info("Passanger : "+fullPasenger.toString()+" selected");

		IdentificationService is = new IdentificationService();
		Identification fullIdentification = is.getById(1);
		log.info("Identification : "+fullIdentification.toString()+" selected");
		
		
		CountryService cs = new CountryService();
		Country fullCountry = cs.getById(1);
		log.info("Country : "+fullCountry.toString()+" selected");

		EmployeeService emps = new EmployeeService();
		Employee fullEmployee= emps.getById(1);
		log.info("Employee : "+fullEmployee.toString()+" selected");
		
		PlaneService planes = new PlaneService();
		Plane fullPlane= planes.getById(1);
		log.info("Employee : "+fullPlane.toString()+" selected");
		
		log.info("Testing delete");
		
		pid.remove(1);
		id.remove(1);
		pd.remove(1);
		cityDAO.remove(1);
		cityDAO.remove(2);
		cityDAO.remove(3);
		emplDAO.remove(1);
		etDAO.remove(1);
		planeDAO.remove(1);
		airDAO.remove(1);
		cd.remove(1);	
		
		log.info("Testing mysql DAOs finished");

    }

}
