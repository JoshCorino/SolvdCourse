package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IPassengerDAO;
import com.solvd.projectAirport.model.Identification;
import com.solvd.projectAirport.model.Passenger;

public class PassengerDAO extends MySQLDAO implements IPassengerDAO{
	
	private final String GET_PASSENGER= "select * from Passengers where id=?";
	private final String REMOVE_PASSENGER= "delete from Passengers where id=?";
	private final String SAVE_PASSENGER= "insert into Passengers(first_name,last_name) values(?,?)";
	private Logger log = LogManager.getLogger(PassengerDAO.class);
	
	@Override
	public Passenger save(Passenger p) {
		Connection con = null;
		PreparedStatement pre = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(SAVE_PASSENGER, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,p.getFirstName());
			pre.setString(2,p.getLastName());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("Passenger saved");
            ResultSet rs = pre.getGeneratedKeys();
            if(rs.next())
            {
                p.setId(rs.getInt(1));
            }
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
        return p;
	}

	@Override
	public Passenger getById(long id) {
		Passenger p = null;
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rset = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_PASSENGER);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next())
				p= new Passenger(rset.getLong("id"),rset.getString("first_name"),rset.getString("last_name"),new ArrayList<Identification>());
					
		} catch (SQLException e) {
			log.error("SQL Exception, can not get",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			try {
				pre.close();
				rset.close();
				cp.releaseConnection(con);
			} catch (SQLException e) {
				log.error("Cant close",e);
			}		
		}
        return p;
	}

	@Override
	public void remove(long id) {
		Connection con = null;
		PreparedStatement pre = null;

        try {
			con = cp.getConnection();
			pre = con.prepareStatement(REMOVE_PASSENGER);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("Passenger deleted");
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

}
