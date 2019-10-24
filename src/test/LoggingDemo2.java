package test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggingDemo2 {

	private static Logger log = LogManager.getLogger(LoggingDemo2.class.getName());

	public static void main(String[] args) {
		log.debug("Debug log message");
		log.error("Error log message");
		log.fatal("Fatal log message");
		log.trace("Fatal log message");
		log.info("Fatal log message");
	}

}
