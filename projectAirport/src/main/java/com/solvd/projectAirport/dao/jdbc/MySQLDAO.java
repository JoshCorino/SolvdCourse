package com.solvd.projectAirport.dao.jdbc;

import com.solvd.projectAirport.connections.ConnectionPool;

public abstract class MySQLDAO {
	protected ConnectionPool cp;

	public MySQLDAO() {
		this.cp = ConnectionPool.getInstance();
	}
	
}
