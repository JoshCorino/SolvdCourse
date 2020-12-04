package com.solvd.projectAirport.model;

import java.sql.Date;

public class Flight extends AbstractEntity {
	private long idPlane;
	private long idPilot1;
	private long idPilot2;
	private long idOrginGate;
	private long idDestinyGate;
	private Date arriveDate;
	
	
	public Flight() {
		super();
	}

	public Flight(long id, long idPlane, long idPilot1, long idPilot2, long idOrginGate, long idDestinyGate,
			Date arriveDate) {
		super(id);
		this.idPlane = idPlane;
		this.idPilot1 = idPilot1;
		this.idPilot2 = idPilot2;
		this.idOrginGate = idOrginGate;
		this.idDestinyGate = idDestinyGate;
		this.arriveDate = arriveDate;
	}

	public long getIdPlane() {
		return idPlane;
	}

	public void setIdPlane(long idPlane) {
		this.idPlane = idPlane;
	}

	public long getIdPilot1() {
		return idPilot1;
	}

	public void setIdPilot1(long idPilot1) {
		this.idPilot1 = idPilot1;
	}

	public long getIdPilot2() {
		return idPilot2;
	}

	public void setIdPilot2(long idPilot2) {
		this.idPilot2 = idPilot2;
	}

	public long getIdOrginGate() {
		return idOrginGate;
	}

	public void setIdOrginGate(long idOrginGate) {
		this.idOrginGate = idOrginGate;
	}

	public long getIdDestinyGate() {
		return idDestinyGate;
	}

	public void setIdDestinyGate(long idDestinyGate) {
		this.idDestinyGate = idDestinyGate;
	}

	public Date getArriveDate() {
		return arriveDate;
	}

	public void setArriveDate(Date arriveDate) {
		this.arriveDate = arriveDate;
	}


	
	
}
