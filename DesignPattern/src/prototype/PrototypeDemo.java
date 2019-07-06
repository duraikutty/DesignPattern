package prototype;

import com.sun.xml.internal.ws.developer.Serialization;

class Person implements Cloneable{
	String name;
	int age;
	Address address;
	public Person(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		return new Person(name, age,(Address) address.clone());
	}
}

class Address implements Cloneable{
	String streetName;
	String city;
	public Address(String streetName, String city) {
		super();
		this.streetName = streetName;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Address(streetName, city);
	}
}

public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Person john = new Person("John", 26, new Address("India first street", "tirunelveli"));
		Person jane = (Person) john.clone();
		
		jane.address.city = "HAHAHAH";
		System.out.println(john);
		System.out.println(jane);
		
		
	}

}
