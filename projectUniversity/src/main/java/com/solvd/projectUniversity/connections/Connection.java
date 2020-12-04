package com.solvd.projectUniversity.connections;

import java.sql.SQLException;

public class Connection {

	private int number;
	//Im not sure what must have the connection to support all of types of connections (for all databases)
	public Connection(int number) {
		this.number=number;
	}
	public boolean close() throws SQLException{ 
		// TODO Auto-generated method stub
		return true;
	}
	
	@Override
	public String toString() {
		return String.valueOf(number);
	}
}
