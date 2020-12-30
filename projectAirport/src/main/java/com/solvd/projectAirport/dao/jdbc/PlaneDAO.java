package com.solvd.projectAirport.dao.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.projectAirport.dao.IPlaneDAO;
import com.solvd.projectAirport.model.City;
import com.solvd.projectAirport.model.Plane;

public class PlaneDAO extends MySQLDAO implements IPlaneDAO{
	
	private final String GET_PLANE= "select * from Planes where id=?";
	private final String GET_PLANES_BY_AIRLINE_ID= "select * from Planes where id_owner=?";
	private final String REMOVE_PLANE= "delete from Planes where id=?";
	private final String SAVE_PLANE= "insert into Planes(model,passengers_capacity,fuel_capacity,id_owner) values(?,?,?,?)";
	private Logger log = LogManager.getLogger(PlaneDAO.class);
	
	@Override
	public Plane save(Plane p) {
		Connection con = null;
		PreparedStatement pre = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(SAVE_PLANE, Statement.RETURN_GENERATED_KEYS);
			pre.setString(1,p.getModel());
			pre.setInt(2,p.getPassengersCapacity());
			pre.setDouble(3,p.getFuelCapacity());
			pre.setLong(4,p.getAirline().getId());
			int rset = pre.executeUpdate();
			if(rset==1)
				log.info("Plane saved");
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
	public Plane getById(long id) {
		Plane p = null;
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rset = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_PLANE);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			if (rset.next())
				p= new Plane(rset.getLong("id"),rset.getString("model"),rset.getInt("passengers_capacity"),rset.getDouble("fuel_capacity"),null);
					
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
			pre = con.prepareStatement(REMOVE_PLANE);
			pre.setLong(1,id);
			int rset = pre.executeUpdate();
			if(rset!=0)
				log.info("Plane deleted");
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
	public ArrayList<Plane> getPlanesByAirlineId(long id) {
		ArrayList<Plane> result = new ArrayList<Plane>();
		Connection con = null;
		PreparedStatement pre = null;
		ResultSet rset = null;
        try {
			con = cp.getConnection();
			pre = con.prepareStatement(GET_PLANES_BY_AIRLINE_ID);
			pre.setLong(1,id);
			rset = pre.executeQuery();
			while (rset.next()) {
				Plane p = new Plane();
				p.setFuelCapacity(rset.getDouble("fuel_capacity"));
				p.setId(rset.getLong("id"));
				p.setModel(rset.getString("model"));
				p.setPassengersCapacity(rset.getInt("passengers_capacity"));
				result.add(p);
			}
			log.info("Cities retrived");
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
