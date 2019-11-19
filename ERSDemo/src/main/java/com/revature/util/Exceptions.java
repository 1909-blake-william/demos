package com.revature.util;

import java.io.IOException;
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
	
	// Marshalling: POJO -> JSON (aka, a write)
	public static void logJsonMarshalException(IOException e, Class<?> clazz) {
		logger.warn("Failed to Marshal object of type {}", clazz.getName());
		logger.warn("Stack Trace: ", e);
	}
	
	// Unmarshalling: JSON -> POJO (aka, a read)
	public static void logJsonUnmarshalException(IOException e, Class<?> clazz) {
		logger.warn("Failed to Unmarshal object of type {}", clazz.getName());
		logger.warn("Stack Trace: ", e);
	}
}
