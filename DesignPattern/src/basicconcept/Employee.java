package basicconcept;

public class Employee {
	private int empId;
	private String empName;
	private double salary;
	private int grade;
	private static String companyName = "IBM";
	Email email;
	
	public void sendMail() {
		email.notifyEmployee();
	}
	
	public Employee(int empId, String empName, Email email) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	
	
	
}
