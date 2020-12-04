package com.solvd.projectUniversity.connections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MyRunnable implements Runnable{
	private String name;
	private ConnectionPool pool;
	private Logger log = LogManager.getLogger(MyRunnable.class);

	public MyRunnable(String threadName, ConnectionPool pool) {
		this.name = threadName;
		this.pool = pool;
	}
	
	@Override
	public void run() {
		
		Connection myConnection = null;
		
		try {
			myConnection = pool.getConnection();
		} catch (InterruptedException e) {
			log.error("The runnable can't get one connection",e);
		}
		
		log.info("MyRunnable " + name + " got connection " + myConnection);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			log.error("The runnable can't sleep",e);
		}
		
		pool.releaseConnection(myConnection);
		log.info("MyRunnable " + name + " release the connection " + myConnection);
	}
}