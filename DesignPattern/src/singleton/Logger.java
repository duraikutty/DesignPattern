package singleton;

import java.io.Serializable;

public class Logger implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3147261525218516872L;
	private int i = 0;
	
	private Logger() {
		
	}
		
	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
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
	
	
	
	protected Object readResolve() 
    { 
        return logger; 
    } 
}
