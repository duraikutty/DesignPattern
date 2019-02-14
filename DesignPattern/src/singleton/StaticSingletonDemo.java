package singleton;

class StaticSingleton {
	private StaticSingleton() {
		throw new RuntimeException("Exception happened at cons");
	}

	private static StaticSingleton singleton;

	
	
	public static synchronized StaticSingleton getInstance() {
		try {
			if(singleton == null) {
				singleton = new StaticSingleton();
			}
		} catch (Exception e) {
			System.out.println("Exception at creating obj");
		}
		return singleton;
	}
	
}

public class StaticSingletonDemo {

	public static void main(String[] args) {
		StaticSingleton singleton = StaticSingleton.getInstance();
		
	}

}
