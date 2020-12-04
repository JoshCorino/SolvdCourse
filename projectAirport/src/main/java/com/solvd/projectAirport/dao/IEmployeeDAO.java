package com.solvd.projectAirport.dao;

import com.solvd.projectAirport.model.Employee;

public interface IEmployeeDAO extends IGenericDAO<Employee>{

	public long getTypeId(long id);
}
