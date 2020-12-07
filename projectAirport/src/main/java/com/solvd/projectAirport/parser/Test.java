package com.solvd.projectAirport.parser;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.solvd.projectAirport.model.Country;

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

		try {
			mapper.writeValue(new File("src/main/resources/country.json"), c);
		} catch (JsonGenerationException e) {
			log.error("Json generation exception",e);
		} catch (JsonMappingException e) {
			log.error("Json mapping exception",e);
		} catch (IOException e) {
			log.error("Can not write the file",e);
		}
		
		

		try {
			Country countryGetted = mapper.readValue(new File("src/main/resources/country.json"), Country.class);
			log.info("Getting country from Json using Jackson");
			log.info(countryGetted.toString());
		} catch (IOException e) {
			log.error(e);
		}
		
		
		
	 }
}
