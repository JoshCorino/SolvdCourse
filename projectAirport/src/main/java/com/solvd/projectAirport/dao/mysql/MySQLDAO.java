package com.solvd.projectAirport.dao.mysql;

import com.solvd.projectAirport.connections.ConnectionPool;

public abstract class MySQLDAO {
	protected ConnectionPool cp;

	public MySQLDAO() {
		this.cp = ConnectionPool.getInstance();
	}
	
}
