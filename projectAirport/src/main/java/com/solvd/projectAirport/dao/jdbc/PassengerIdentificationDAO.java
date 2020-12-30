package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IPassengerIdentificationDAO;
import com.solvd.projectAirport.model.PassengerIdentification;

public class PassengerIdentificationDAO extends MySQLDAO implements IPassengerIdentificationDAO{
	
	private final String GET_PASSENGER_IDENTIFICATION= "select * from Passengers_has_Identifications where id=?";
	private final String REMOVE_PASSENGER_IDENTIFICATION= "delete from Passengers_has_Identifications where id=?";
	private final String SAVE_PASSENGER_IDENTIFICATION= "insert into Passengers_has_Identifications(id_passenger,id_identification,expiration_date) values(?,?,?)";
	private final String GET_IDENTIFICATIONS_IDS_FROM_PASSENGER_ID= "select id_identification from Passengers_has_Identifications where id=?";
	
	private Logger log = LogManager.getLogger(PassengerIdentificationDAO.class);
	
	@Override
	public PassengerIdentification save(PassengerIdentification p) {
		Connection con = null;
		PreparedStatement pre  = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(SAVE_PASSENGER_IDENTIFICATION, Statement.RETURN_GENERATED_KEYS);
			pre.setLong(1,p.getIdPassenger());
			pre.setLong(2,p.getIdIdentification());
			pre.setDate(3,p.getCreationDate());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("PassengerIdentification saved");
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
	public PassengerIdentification getById(long id) {
		PassengerIdentification pi = null;
		Connection con = null;
		PreparedStatement pre  = null;
		ResultSet rset = null;
		try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_PASSENGER_IDENTIFICATION);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next()) pi= new PassengerIdentification(rset.getLong("id"),rset.getLong("id_passenger"),rset.getLong("id_identification"),rset.getDate("expiration_date"));
        } catch (SQLException e) {
			log.error("SQL Exception, can not get",e);
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
        return pi;
	}

	@Override
	public void remove(long id) {
		Connection con = null;
		PreparedStatement pre = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(REMOVE_PASSENGER_IDENTIFICATION);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("PassengerIdentification deleted");
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
	public ArrayList<Long> getIdentificationsFromPassengerId(long id) {
		ArrayList<Long> result = new ArrayList<Long>();
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rset = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_IDENTIFICATIONS_IDS_FROM_PASSENGER_ID);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			while (rset.next()) {
				  result.add(rset.getLong("id_identification"));
			}
			log.info("PassengerIdentifications retrived");
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
        return result;

	}
}
