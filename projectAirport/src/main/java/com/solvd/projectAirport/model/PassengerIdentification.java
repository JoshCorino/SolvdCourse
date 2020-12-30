package com.solvd.projectAirport.model;

import java.sql.Date;

public class PassengerIdentification extends AbstractEntity{
	private long idPassenger;
	private long idIdentification;
	private Date creationDate;
	
	public PassengerIdentification() {
		super();
	}
	public PassengerIdentification(long idPassenger,long idIdentification, Date date) {
		super();
		this.idIdentification=idIdentification;
		this.idPassenger=idPassenger;
		this.creationDate=date;
	}
	public PassengerIdentification(long id,long idPassenger,long idIdentification, Date date) {
		super(id);
		this.idIdentification=idIdentification;
		this.idPassenger=idPassenger;
		this.creationDate=date;
	}
	public long getIdPassenger() {
		return idPassenger;
	}
	public void setIdPassenger(long idPassenger) {
		this.idPassenger = idPassenger;
	}
	public long getIdIdentification() {
		return idIdentification;
	}
	public void setIdIdentification(long idIdentification) {
		this.idIdentification = idIdentification;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date expirationDate) {
		this.creationDate = expirationDate;
	}
	
}
