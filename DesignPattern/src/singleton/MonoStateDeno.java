package singleton;

class Ceo{
	private static String name;
	private static String empNo;
	public static String getName() {
		return name;
	}
	public static void setName(String name) {
		Ceo.name = name;
	}
	public static String getEmpNo() {
		return empNo;
	}
	public static void setEmpNo(String empNo) {
		Ceo.empNo = empNo;
	}
	
}

public class MonoStateDeno {

	public static void main(String[] args) {
	
		Ceo ceo1 = new Ceo();
		ceo1.setEmpNo("1000");
		ceo1.setName("durai");
		
		Ceo ceo2 = new Ceo();
		System.out.println(ceo2.getName());
		ceo2.setName("kutty");
		System.out.println(ceo1.getName());
		System.out.println(ceo1.hashCode());
		System.out.println(ceo2.hashCode());
		
	}

}
