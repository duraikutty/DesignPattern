package singleton;

public class LoggerTest {

	public static void main(String[] args) {
		
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
	}

}
