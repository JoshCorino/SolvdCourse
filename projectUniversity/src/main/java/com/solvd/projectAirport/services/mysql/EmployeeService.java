package com.solvd.projectAirport.services.mysql;

import com.solvd.projectAirport.dao.IEmployeeDAO;
import com.solvd.projectAirport.dao.IEmployeeTypeDAO;
import com.solvd.projectAirport.dao.mysql.EmployeeDAO;
import com.solvd.projectAirport.dao.mysql.EmployeeTypeDAO;
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
