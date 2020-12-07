package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IEmployeeTypeDAO;
import com.solvd.projectAirport.model.EmployeeType;

public class EmployeeTypeDAO extends MySQLDAO implements IEmployeeTypeDAO{

	private final String GET_EMPLOYEE_TYPE= "select * from Employee_Type where id=?";
	private final String REMOVE_EMPLOYEE_TYPE= "delete from Employee_Type where id=?";
	private final String SAVE_EMPLOYEE_TYPE= "insert into Employee_Type(name,description) values(?,?)";
	
	
	private Logger log = LogManager.getLogger(IdentificationDAO.class);
	
	@Override
	public EmployeeType save(EmployeeType i) {
		Connection con=null;
        try {
			con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(SAVE_EMPLOYEE_TYPE, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,i.getName());
			pre.setString(2,i.getDescription());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("EmployeeType saved");
            ResultSet rs = pre.getGeneratedKeys();
            if(rs.next())
            {
                i.setId(rs.getInt(1));
            }
		} catch (SQLException e) {
			log.error("SQL Exception, can not insert",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally {
			cp.releaseConnection(con);
		}
        return i;
	}

	@Override
	public EmployeeType getById(long id) {
		EmployeeType i =null;
		Connection con = null ;
        try {
			 con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(GET_EMPLOYEE_TYPE);
			pre.setLong(1,id);
			ResultSet rset = pre.executeQuery();
			if (rset.next()) i= new EmployeeType(rset.getLong("id"),rset.getString("name"),rset.getString("description"));
			
		} catch (SQLException e) {
			log.error("SQL Exception, can not get",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			cp.releaseConnection(con);
		}
        return i;
	}

	@Override
	public void remove(long id) {
		Connection con = null ;
        try {
			 con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(REMOVE_EMPLOYEE_TYPE);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("EmployeeType deleted");

		} catch (SQLException e) {
			log.error("SQL Exception, can not insert",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			cp.releaseConnection(con);
		}
		
	}


}
