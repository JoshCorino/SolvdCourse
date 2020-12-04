package com.solvd.projectAirport.dao.mybatis;

import com.solvd.projectAirport.connections.ConnectionPool;

public abstract class MyBatisDAO {
	protected ConnectionPool cp;

	public MyBatisDAO() {
		this.cp = ConnectionPool.getInstance();
	}
}
