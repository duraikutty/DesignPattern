package singleton;

public class Logger {
	
	private Logger() {
		
	}
	
	//Static method - getInstance is returning this object. So, this must be static
	private static Logger logger;
	
	//Without creating object LoggerTest have to call this method.
	public static Logger getInstance() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
}
