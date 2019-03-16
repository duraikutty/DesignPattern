package buliderpattern;

class Person{
	public String name;
	public String position;
	@Override
	public String toString() {
		return "Person [name=" + name + ", position=" + position + "]";
	}
	
	
}

class PersonBulider<SELF extends PersonBulider<SELF>>{
	protected Person person = new Person();
	
	public SELF setName(String name) {
		person.name = name;
		return self();
	}
	

	public Person bulid() {
		return person;
	}
	
	@SuppressWarnings("unchecked")
	protected SELF self() {
		return (SELF) this;
	}
}

class EmployeeBulider extends PersonBulider<EmployeeBulider>{
	public EmployeeBulider setPosition(String position) {
		person.position = position;
		return self();
	}
	
	protected EmployeeBulider self() {
		return  this;
	}
	
	
}

public class BuliderInheritanceWithRecursiveGenerics {

	public static void main(String[] args) {
		//PersonBulider personBulider = new PersonBulider();
		EmployeeBulider employeeBulider = new EmployeeBulider();
		Person person = employeeBulider
				.setName("durai")
				.setPosition("ceo")
				.bulid();
		System.out.println(person);

	}

}
