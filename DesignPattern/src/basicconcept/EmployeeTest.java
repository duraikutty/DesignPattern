package basicconcept;

public class EmployeeTest {

	public static void main(String[] args) {
		
		
		Email email = new OutlookEmail();
		Employee employee = new Employee(1001, "Duraikutty",email);
		employee.sendMail();
		
		email = new WebService();
		Employee employee1 = new Employee(1001, "Duraikutty",email);
		employee1.sendMail();
	}

}
