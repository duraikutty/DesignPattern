package singleton;

class ThreadSaftySingleton{
	private ThreadSaftySingleton() {}
	
	private static ThreadSaftySingleton instance = null;
	public static ThreadSaftySingleton getInstance(){
	    if(instance == null){
	        synchronized (ThreadSaftySingleton.class) {
	            if(instance == null){
	                instance = new ThreadSaftySingleton();
	            }
	        }
	    }
	    return instance;
	}
}

class RunnableDemo implements Runnable{

	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(ThreadSaftySingleton.getInstance().hashCode());
		}
		
	}
}

public class ThreadSafetySingletonDemo {

	public static void main(String[] args) {
		RunnableDemo r1 = new RunnableDemo();
		RunnableDemo r2 = new RunnableDemo();
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();

	}

}
