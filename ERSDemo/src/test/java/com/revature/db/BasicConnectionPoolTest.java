package com.revature.db;

import java.sql.Connection;

import org.junit.Test;

import com.revature.util.BasicConnectionPool;
import com.revature.util.ConnectionPool;

public class BasicConnectionPoolTest {
	
	final ConnectionPool cp = BasicConnectionPool.getInstance();

	@Test
	public void connectionPool_ShouldHaveConnections() {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 8; i++) {
			Connection conn = cp.getConnection();
			System.out.println(conn);
			cp.release(conn);
		}
		System.out.println("Completed in " + (System.currentTimeMillis() - start) + "ms");
	}
}
