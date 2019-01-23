package basicconcept;

public class Test {

	public static void main(String[] args) {
		
		ClassA classA = new ClassA();
		ClassB classB = new ClassB();
		
		System.out.println("ClassA");
		classA.methodA();
		
		System.out.println("ClassB");
		classB.methodA();
		classB.methodB();
		
		System.out.println("ClassA a = new ClassB();");
		ClassA a = new ClassB();
		a.methodA();
		//we cann't call a.methodB()
		//a.methodB();
		
		
		
		InterfaceA interfaceA = new ClassInterfaceB();
		interfaceA.A();
		
		//We can't call AExtra()
		//interfaceA.AExtra();
	}

}
