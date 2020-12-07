package com.solvd.projectAirport.services;

import com.solvd.projectAirport.dao.IEmployeeDAO;
import com.solvd.projectAirport.dao.IEmployeeTypeDAO;
import com.solvd.projectAirport.dao.jdbc.EmployeeDAO;
import com.solvd.projectAirport.dao.jdbc.EmployeeTypeDAO;
import com.solvd.projectAirport.model.Employee;

public class EmployeeService {
	IEmployeeDAO employeeDAO = new EmployeeDAO();
	IEmployeeTypeDAO employeeTypeDAO = new EmployeeTypeDAO();
	
	public Employee getById(long id) {
		Employee result = employeeDAO.getById(id);
		result.setType(employeeTypeDAO.getById(employeeDAO.getTypeId(id)));
		return result;
	}
}
