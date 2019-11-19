package com.revature.util;

import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Exceptions {
	
	private static Logger logger = LogManager.getLogger(Exceptions.class);

	private Exceptions() {}
	
	public static void logSQLException(SQLException e) {
		logger.warn("SQL Message: {}", e.getMessage());
		logger.warn("Error Code: {}", e.getErrorCode());
		logger.warn("SQL State: {}", e.getSQLState());
		logger.warn("Stack Trace: ", e);
	}
}
