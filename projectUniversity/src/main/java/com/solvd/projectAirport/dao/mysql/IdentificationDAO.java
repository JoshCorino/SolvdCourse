package com.solvd.projectAirport.dao.mysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IIdentificationDAO;
import com.solvd.projectAirport.model.Identification;

public class IdentificationDAO extends MySQLDAO implements IIdentificationDAO{
	
	private final String GET_IDENTIFICATION= "select * from Identifications where id=?";
	private final String GET_COUNTRY_BY_IDENTIFICATION_ID= "select id_country from Identifications where id=?";
	private final String REMOVE_IDENTIFICATION= "delete from Identifications where id=?";
	private final String SAVE_IDENTIFICATION= "insert into Identifications(type,description,id_country) values(?,?,?)";
	
	
	private Logger log = LogManager.getLogger(IdentificationDAO.class);
	
	@Override
	public Identification save(Identification i) {
		Connection con=null;
        try {
			con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(SAVE_IDENTIFICATION, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,i.getType());
			pre.setString(2,i.getDescription());
			pre.setLong(3,i.getCountry().getId());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("Identification saved");
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
	public Identification getById(long id) {
		Identification i =null;
		Connection con = null ;
        try {
			 con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(GET_IDENTIFICATION);
			pre.setLong(1,id);
			ResultSet rset = pre.executeQuery();
			if (rset.next()) i= new Identification(rset.getLong("id"),rset.getString("type"),rset.getString("description"),null);
			
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
			PreparedStatement pre = con.prepareStatement(REMOVE_IDENTIFICATION);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("Identification deleted");

		} catch (SQLException e) {
			log.error("SQL Exception, can not insert",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			cp.releaseConnection(con);
		}
		
	}

	@Override
	public long getCountryIdById(long id) {
		long l =0;
		Connection con = null ;
        try {
			con = cp.getConnection();
			PreparedStatement pre = con.prepareStatement(GET_COUNTRY_BY_IDENTIFICATION_ID);
			pre.setLong(1,id);
			ResultSet rset = pre.executeQuery();
			if (rset.next()) l= rset.getLong("id_country");
			
		} catch (SQLException e) {
			log.error("SQL Exception, can not get",e);
		} catch (InterruptedException e) {
			log.error("Cant get a connection",e);
		}finally{
			cp.releaseConnection(con);
		}
        return l;
	}



}
