package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IEmployeeDAO;
import com.solvd.projectAirport.model.Employee;

public class EmployeeDAO extends MySQLDAO implements IEmployeeDAO{

	private final String GET_EMPLOYEE= "select * from Employee where id=?";
	private final String GET_TYPE_ID_EMPLOYEE= "select id_type from Employee where id=?";
	private final String REMOVE_EMPLOYEE= "delete from Employee where id=?";
	private final String SAVE_EMPLOYEE= "insert into Employee(first_name,last_name,cellphone,id_type) values(?,?,?,?)";
	
	
	private Logger log = LogManager.getLogger(IdentificationDAO.class);
	
	@Override
	public Employee save(Employee e) {
		Connection con=null;
		PreparedStatement pre= null;

        try {
			con = cp.getConnection();
			pre = con.prepareStatement(SAVE_EMPLOYEE, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,e.getFirstName());
			pre.setString(2,e.getLastName());
			pre.setString(3,e.getCellphone());
			pre.setLong(4,e.getType().getId());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("Employee saved");
            ResultSet rs = pre.getGeneratedKeys();
            if(rs.next())
            {
                e.setId(rs.getInt(1));
            }
		} catch (SQLException ex) {
			log.error("SQL Exception, can not insert",ex);
		} catch (InterruptedException ex) {
			log.error("Cant get a connection",ex);
		}finally {
			try {
				pre.close();
				cp.releaseConnection(con);
			} catch (SQLException e1) {
				log.error("Cant close",e1);
			}		
		}
        return e;
	}

	@Override
	public Employee getById(long id) {
		Employee e =null;
		Connection con = null ;
		PreparedStatement pre= null;
		ResultSet rset =null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_EMPLOYEE);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next()) e= new Employee(rset.getLong("id"),rset.getString("first_name"),rset.getString("last_name"),rset.getString("cellphone"),null);
			
		} catch (SQLException ex) {
			log.error("SQL Exception, can not get",ex);
		} catch (InterruptedException ex) {
			log.error("Cant get a connection",ex);
		}finally{
			try {
				pre.close();
				rset.close();
				cp.releaseConnection(con);
			} catch (SQLException e1) {
				log.error("Cant close",e1);
			}		
		}
        return e;
	}

	@Override
	public void remove(long id) {
		Connection con = null;
		PreparedStatement pre= null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(REMOVE_EMPLOYEE);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("Employee deleted");

		} catch (SQLException e) {
			log.error("SQL Exception, can not insert",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			try {
				pre.close();
				cp.releaseConnection(con);
			} catch (SQLException e) {
				log.error("Cant close",e);
			}		
		}
		
	}

	@Override
	public long getTypeId(long id) {
		long l =0;
		Connection con = null ;
		PreparedStatement pre= null;
		ResultSet rset=null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_TYPE_ID_EMPLOYEE);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next()) l= rset.getLong("id_type");
			
		} catch (SQLException ex) {
			log.error("SQL Exception, can not get",ex);
		} catch (InterruptedException ex) {
			log.error("Cant get a connection",ex);
		}finally{
			try {
				pre.close();
				rset.close();
				cp.releaseConnection(con);
			} catch (SQLException e) {
				log.error("Cant close",e);
			}		
		}
        return l;
	}

}
