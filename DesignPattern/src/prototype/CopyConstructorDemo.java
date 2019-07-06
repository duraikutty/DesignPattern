package prototype;


class Employee{
	String name;
	int age;
	EmpAddress empAddress;
	public Employee(String name, int age, EmpAddress empAddress) {
		this.name = name;
		this.age = age;
		this.empAddress = empAddress;
	}
	
	public Employee(Employee other) {
		name = other.name;
		age = other.age;
		empAddress = new EmpAddress(other.empAddress);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + empAddress + "]";
	}
	
}

class EmpAddress{
	String streetName;
	String city;
	public EmpAddress(String streetName, String city) {
		this.streetName = streetName;
		this.city = city;
	}
	
	public EmpAddress(EmpAddress other) {
		this(other.streetName,other.city);
	}
	
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", city=" + city + "]";
	}
	
}

public class CopyConstructorDemo {

	public static void main(String[] args) {
		
		Employee john = new Employee("John", 25, new EmpAddress("North strret", "Tirunelveli"));
		Employee jane = new Employee(john);
		
		jane.empAddress.city = "CHENNAI";
		
		System.out.println(john);
		System.out.println(jane);

	}

}
