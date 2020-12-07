package com.solvd.projectAirport.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;


@XmlAccessorType(XmlAccessType.FIELD)
public abstract class AbstractEntity {
	public long id;

	public AbstractEntity() {
		this.id = 0;
	}
	
	public AbstractEntity(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "AbstractEntity [id=" + id + "]";
	}
	
}
