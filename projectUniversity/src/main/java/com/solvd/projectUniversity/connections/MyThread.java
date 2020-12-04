package com.solvd.projectUniversity.connections;

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
		} catch (InterruptedException e) {
			log.error("The thread can't get one connection",e);
		}
		
		log.info("MyThread " + name + " got connection " + myConnection);
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			log.error("The thread can't sleep",e);
		}
		
		pool.releaseConnection(myConnection);
		log.info("MyThread " + name + " release the connection " + myConnection);
	}
	
}
