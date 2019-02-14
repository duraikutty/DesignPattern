package buliderpattern;


class Phone{

	private String os;
	private String processor;
	private int batery;
	private int ram;
	public Phone(String os, String processor, int batery, int ram) {
		super();
		this.os = os;
		this.processor = processor;
		this.batery = batery;
		this.ram = ram;
	}
	@Override
	public String toString() {
		return "Phone [os=" + os + ", processor=" + processor + ", batery=" + batery + ", ram=" + ram + "]";
	}
	
}

class PhoneBulider{
	private String os;
	private String processor;
	private int batery;
	private int ram;
	
	public PhoneBulider setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBulider setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	public PhoneBulider setBatery(int batery) {
		this.batery = batery;
		return this;
	}
	public PhoneBulider setRam(int ram) {
		this.ram = ram;
		return this;
	}
	
	public Phone bulid() {
		return new Phone(os, processor,batery,ram);
	}
	
}


public class FluentBuliderDemo {

	public static void main(String[] args) {
	
		Phone p = new PhoneBulider().setBatery(10).setOs("Android").setRam(2).setProcessor("intel").bulid();
		System.out.println(p);
	}

}
