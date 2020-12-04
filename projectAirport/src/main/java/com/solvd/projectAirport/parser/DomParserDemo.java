package com.solvd.projectAirport.parser;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;

import javax.xml.validation.Schema;
import org.w3c.dom.Node;
import org.w3c.dom.Element;

public class DomParserDemo extends ParserDemo{
	private static final String COUNTRY="country";
	private static final String CITY="city";
	private static final String ID="id";
	private static final String NAME="name";
	private static final String SCHEMA_PATH="src/main/resources/DemoSchema.xsd";
	Logger log = LogManager.getLogger(DomParserDemo.class);
	
	 
	public  List<Country> getCountriesWithCities(String path){
		try {
			 Schema schema = loadSchema(SCHEMA_PATH);
			 Document document = parseXmlDom(path);
			 validateXml(schema, document);
	         File inputFile = new File(path);
	         DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	         DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	         Document doc = dBuilder.parse(inputFile);
	         doc.getDocumentElement().normalize();
	         
	         log.info("Getting countries with cities");
	         log.info("Getting countries");
	         List<Country> countries = new ArrayList<Country>();
	         
	         NodeList nList = doc.getElementsByTagName(COUNTRY);
	        
	         for (int temp = 0; temp < nList.getLength(); temp++) {
	 
	            Node nNode = nList.item(temp);
	            if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	               Element eElement = (Element) nNode;
	               Country c = new Country();
	               c.setId(Long.parseLong(eElement.getElementsByTagName(ID).item(0).getTextContent()));
	               c.setName(eElement.getElementsByTagName(NAME).item(0).getTextContent());
	               
		  	       NodeList cityList = eElement.getElementsByTagName(CITY);
		  	       List<City> cities =new ArrayList<City>();
	               for (int temp2 = 0; temp2 < cityList.getLength(); temp2++) {
		  	      	 
		 	          Node childNode = cityList.item(temp2);
		 	          if (nNode.getNodeType() == Node.ELEMENT_NODE) {
		 	             Element childElement = (Element) childNode;
		 	             City city = new City();
		 	             city.setId(Long.parseLong(childElement.getElementsByTagName(ID).item(0).getTextContent()));
		 	             city.setName(childElement.getElementsByTagName(NAME).item(0).getTextContent());
		 	             city.setIdCountry(Long.parseLong(eElement.getElementsByTagName(ID).item(0).getTextContent()));
		 	             cities.add(city);
		 	          }
		 	       } 
		  	       c.addCities(cities);
	               countries.add(c);
	            }
	         }
	                                
	         return countries;
	      } catch (Exception e) {
	    	  log.error("Can not get countries with cities",e);
	      }
		return new ArrayList<Country>();
	}
	

}