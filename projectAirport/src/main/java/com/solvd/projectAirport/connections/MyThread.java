package com.solvd.projectAirport.connections;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyThread extends Thread{
	private String name;
	private ConnectionPool pool;
	private Logger log = LogManager.getLogger(MyThread.class);

	public MyThread(String threadName, ConnectionPool pool) {
		this.name = threadName;
		this.pool = pool;
	}
	
	@Override
	public void run() {
		
		Connection myConnection = null;
		
		try {
			myConnection = pool.getConnection();
			log.info("MyRunnable " + name + " got connection " + myConnection);
	        String strSelect = "INSERT INTO Countries(name) VALUES ('China');";
	        log.info("The SQL statement is: " + strSelect + "\n"); 
	        Statement stmt = myConnection.createStatement();
	        int rset = stmt.executeUpdate(strSelect);
		} catch (InterruptedException  e) {
			log.error("The runnable can't get one connection",e);
		}catch (SQLException  e) {
			log.error("SQL Exception",e);
		}	
		
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			log.error("The runnable can't sleep",e);
		}
		
		pool.releaseConnection(myConnection);
		log.info("MyRunnable " + name + " release the connection " + myConnection);
	}
}
	

