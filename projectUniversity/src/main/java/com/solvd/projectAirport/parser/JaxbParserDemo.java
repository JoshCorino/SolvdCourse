package com.solvd.projectAirport.parser;

import java.util.List;

import javax.xml.validation.Schema;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;

import com.solvd.projectAirport.model.Country;

public class JaxbParserDemo extends ParserDemo{
	
	private static final String SCHEMA_PATH="src/main/resources/DemoSchema.xsd";
	Logger log = LogManager.getLogger(DomParserDemo.class);

	public  List<Country> getCountriesWithCities(String path){
		Schema schema = loadSchema(SCHEMA_PATH);
		Document document = parseXmlDom(path);
		validateXml(schema, document);
		return null;
	}
}
