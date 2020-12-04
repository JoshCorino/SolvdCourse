package com.solvd.projectUniversity.connections;

import java.sql.SQLException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;;

public class ConnectionPool {

	private Logger log = LogManager.getLogger(ConnectionPool.class);
	private BlockingQueue<Connection> connections;
	private int connectionsCount;
	public static final Integer MAX_POOL_SIZE = 5;
	
	public ConnectionPool(){
		connections = new LinkedBlockingQueue<Connection>(MAX_POOL_SIZE);
		connectionsCount = 0;
	};

	private void initConnection() {
		connections.add(new Connection(connectionsCount));
		connectionsCount++;
	}

	public Connection getConnection() throws InterruptedException {
		synchronized (ConnectionPool.class){
			if(connections.size() == 0 && connectionsCount < MAX_POOL_SIZE ) {
				initConnection();
			}
		}
		return connections.take();
	}
	
	public void releaseConnection(Connection connectionReleased) {
		connections.offer(connectionReleased);
	}
	
	public boolean closeAll() {

		connections.forEach(c -> {
			try {
				c.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				log.error("The pool cant close one connection",e);
			}
		});
		connections = new LinkedBlockingQueue<Connection>(MAX_POOL_SIZE);
		connectionsCount = 0;
		return true;
	}

}