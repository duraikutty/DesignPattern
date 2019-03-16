package factorypattern;

interface HotDrink{
	void consume();
}

class Tea implements HotDrink{

	@Override
	public void consume() {
		System.out.println("Tea is delicious");
	}
	
}

class Coffee implements HotDrink{

	@Override
	public void consume() {
		System.out.println("Coffee is delicious");
	}
	
}

interface HotDrinkFactory{
	HotDrink prepare(int amount);
}

class TeaFactory implements HotDrinkFactory{

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Tea !!!!!"+amount);
		return new Tea();
	}
	
}

class CoffeeFactory implements HotDrinkFactory{

	@Override
	public HotDrink prepare(int amount) {
		System.out.println("Coffee!!!!"+amount);
		return new Coffee();
	}
	
}

public class AbstractFactoryDemo {

	public static void main(String[] args) {
		

	}

}
