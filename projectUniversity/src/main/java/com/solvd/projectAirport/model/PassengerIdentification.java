package com.solvd.projectAirport.model;

import java.sql.Date;

public class PassengerIdentification extends AbstractEntity{
	private long idPassenger;
	private long idIdentification;
	private Date expirationDate;
	
	public PassengerIdentification() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PassengerIdentification(long id, long idPassenger, long idIdentification, Date expirationDate) {
		super(id);
		this.idPassenger = idPassenger;
		this.idIdentification = idIdentification;
		this.expirationDate = expirationDate;
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
	public Date getExpirationDate() {
		return expirationDate;
	}
	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}
	
}
