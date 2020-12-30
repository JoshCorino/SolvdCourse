package com.solvd.projectAirport.parser;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.solvd.projectAirport.model.Country;
import com.solvd.projectAirport.model.Flight;
import com.solvd.projectAirport.model.Identification;
import com.solvd.projectAirport.model.InmigrationLog;
import com.solvd.projectAirport.model.Passenger;

public class Test {
	 static Logger log = LogManager.getLogger(Test.class);

	 public static void main(String[] args) {
		String path = "src/main/resources/demo.xml";
		 
		//DOM section
		log.info("Getting data with DOM");
	 	DomParser dp =new DomParser();
		List<Country> countries = dp.getCountriesWithCities(path);
		log.info(countries.get(0).toString());
		 
		//Jaxb section
		log.info("Getting data with Jaxb");    
		JaxbParserCountry pc = new JaxbParserCountry();
		Country c = pc.getCountry(path);
		log.info(c.toString());
		
		
		//JSON section
		
		log.info("Saving json using Jackson");
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(SerializationFeature.INDENT_OUTPUT, true);
	    mapper.registerModule(new JavaTimeModule());
	    mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
		
		//Complex example with date
		Passenger p = new Passenger(1,"Joshua","Corino",new ArrayList<Identification>());
		Identification i = new Identification(1,"Passport","passport passport",c);
		p.addIdentification(i);
		
		Flight f = new Flight(1,1,1,1,1,1,new Date(Calendar.getInstance().getTime().getTime()));
		InmigrationLog iLog = new InmigrationLog(1,new Date(Calendar.getInstance().getTime().getTime()), p,f);
		
		try {
			mapper.writeValue(new File("src/main/resources/inmigrationLog.json"), iLog);
		} catch (JsonGenerationException e) {
			log.error("Json generation exception",e);
		} catch (JsonMappingException e) {
			log.error("Json mapping exception",e);
		} catch (IOException e) {
			log.error("Can not write the file",e);
		}
				
		try {
			InmigrationLog inmigrationLogGetted = mapper.readValue(new File("src/main/resources/inmigrationLog.json"), InmigrationLog.class);
			log.info("Getting InmigrationLog from Json using Jackson");
			log.info(inmigrationLogGetted.toString());
		} catch (IOException e) {
			log.error(e);
		}
		
		log.info("Test finished");
		
	 }
}
