package com.solvd.projectAirport.services;

import java.util.Optional;

import com.solvd.projectAirport.dao.IEmployeeDAO;
import com.solvd.projectAirport.dao.IEmployeeTypeDAO;
import com.solvd.projectAirport.dao.jdbc.EmployeeDAO;
import com.solvd.projectAirport.dao.jdbc.EmployeeTypeDAO;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Country;
import com.solvd.projectAirport.model.Employee;

public class EmployeeService {
	IEmployeeDAO employeeDAO = new EmployeeDAO();
	IEmployeeTypeDAO employeeTypeDAO = new EmployeeTypeDAO();
	
	public Optional<Employee> getById(long id) {
		Employee result = employeeDAO.getById(id);
		if(result!= null) {
			result.setType(employeeTypeDAO.getById(employeeDAO.getTypeId(id)));
		}
		return Optional.of(result);
	}
	
	public Optional<Employee> save(Employee c) {
		Employee result=null;
		if(employeeTypeDAO.save(c.getType())!= null) {
			result = employeeDAO.save(c);
		}
		return Optional.of(result);
	}
}
