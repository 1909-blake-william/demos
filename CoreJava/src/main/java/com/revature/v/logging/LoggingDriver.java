package com.revature.v.logging;

import org.apache.log4j.Logger;

public class LoggingDriver {
	private static Logger log = Logger.getRootLogger();

	public static void main(String[] args) {
		log.fatal("fatal log");
		log.error("error log");
		log.warn("warn log");
		log.info("info log");
		log.debug("debug log");
		log.trace("trace log");
	}
}
