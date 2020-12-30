package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IAirlineDAO;
import com.solvd.projectAirport.model.Airline;

public class AirlineDAO extends MySQLDAO implements IAirlineDAO{
	
	private final String GET_AIRLINE= "select * from Airlines where id=?";
	private final String REMOVE_AIRLINE= "delete from Airlines where id=?";
	private final String SAVE_AIRLINE= "insert into Airlines(name,contact) values(?,?)";
	private Logger log = LogManager.getLogger(PlaneDAO.class);
	
	@Override
	public Airline save(Airline a) {
		Connection con = null;
		PreparedStatement pre= null;
		ResultSet rs= null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(SAVE_AIRLINE, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,a.getName());
			pre.setString(2,a.getContact());

			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("Airline saved");
            rs = pre.getGeneratedKeys();
            if(rs.next())
            {
                a.setId(rs.getInt(1));
            }

		} catch (SQLException e) {
			log.error("SQL Exception, can not insert",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			try {
				pre.close();
				rs.close();
				cp.releaseConnection(con);
			} catch (SQLException e) {
				log.error("Cant close",e);
			}			
		}
        return a;
	}

	@Override
	public Airline getById(long id) {
		Airline a = null;
		Connection con = null;
		PreparedStatement pre= null;
		ResultSet rset= null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_AIRLINE);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next())
				a= new Airline(rset.getLong("id"),rset.getString("name"),rset.getString("contact"));
					
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
        return a;
	}

	@Override
	public void remove(long id) {
		Connection con = null;
		PreparedStatement pre= null;		
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(REMOVE_AIRLINE);
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
