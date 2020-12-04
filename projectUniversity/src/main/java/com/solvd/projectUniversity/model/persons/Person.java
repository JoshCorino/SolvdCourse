package com.solvd.projectUniversity.model.persons;

import java.util.Objects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectUniversity.exceptions.NullIdentificationException;
import com.solvd.projectUniversity.model.university.Departament;

public abstract class Person {
	private String firstName;
	private String surname;
	private String email;
	private Integer identification;
	private Logger log = LogManager.getLogger(Person.class);

	public Person(String firstName, String surname, String email, Integer identification) {
		
		this.firstName = firstName;
		this.surname = surname;
		this.email = email;
		try {
			this.setIdentification(identification);
		} catch (NullIdentificationException e) {
			// TODO Auto-generated catch block
			log.error("The identification cant be null",e);
		}

	}

	@Override
	public String toString() {
		return ("First Name: "+firstName+" Surname: "+surname+" Email: "+email+" Identification: "+identification);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName,surname,email,identification);
	}
	
	@Override
	public boolean equals(Object obj) {

		if(obj==null) return false;
		
		if(!(obj instanceof Person)) return false;
		
		Person p = (Person)obj;
		
		if(p.hashCode() != this.hashCode()) return false;
		
		if(p.getFirstName()==firstName && p.getSurname()==surname && p.getEmail()==email && p.getIdentification()==identification) return true;
		
		return false;

	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the identification
	 */
	public int getIdentification() {
		return identification;
	}
	/**
	 * @param identification the identification to set
	 * @throws NullIdentificationException 
	 */
	public void setIdentification(Integer identification) throws NullIdentificationException {
		if(identification==null) {
			throw new NullIdentificationException();
		}
		this.identification = identification;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}



}
