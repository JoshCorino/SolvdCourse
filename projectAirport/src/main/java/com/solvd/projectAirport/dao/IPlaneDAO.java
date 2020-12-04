package com.solvd.projectAirport.dao;

import com.solvd.projectAirport.model.Plane;

public interface IPlaneDAO extends IGenericDAO<Plane>{

	public long getAirlineIdById(long id);
}
