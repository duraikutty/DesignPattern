package factorypattern;

public class PC implements Computer {

	private String RAM;
	private String HDD;
	private String CPU;
	
	public PC(String ram, String hdd, String cpu) {
		this.RAM = ram;
		this.HDD = hdd;
		this.CPU = cpu;
	}
	
	@Override
	public String getRam() {
		return this.RAM;
	}

	@Override
	public String getHDD() {
		return this.HDD;
	}

	@Override
	public String getCPU() {
		return this.CPU;
	}
}
