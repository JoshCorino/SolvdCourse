package com.solvd.projectUniversity.model.persons;

import java.util.Date;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectUniversity.exceptions.SalaryZeroException;
import com.solvd.projectUniversity.model.university.Departament;

public abstract class Employee extends Person {
	
	private double salary;
	private Date paymentDate;
	private Logger log = LogManager.getLogger(Employee.class);

	public Employee(String firstName, String surname, String email, int identification,double salary, Date paymentDate) {
		super(firstName, surname, email, identification);
		
		try {
			this.setSalary(salary);
		} catch (SalaryZeroException e) {
			// TODO Auto-generated catch block
			log.error("The salary cant be zero ",e);

		}
		this.setPaymentDate(paymentDate);
	}

	

	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) throws SalaryZeroException{
		this.salary = salary;
	}



	/**
	 * @return the paymentDate
	 */
	public Date getPaymentDate() {
		return paymentDate;
	}



	/**
	 * @param paymentDate the paymentDate to set
	 */
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}


	
}