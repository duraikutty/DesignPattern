package singleton;

public class LoggerTest {

	public static void main(String[] args) {
		
		Logger l1 = Logger.getInstance();
		Logger l2 = Logger.getInstance();
		l1.setI(10);
		l2.setI(20);
		System.out.println(l1.getI());
		
		System.out.println(l1.hashCode());
		System.out.println(l2.hashCode());
		
		
	}
	
	
	

}
