package factorypattern;

public class ComputerClient {
	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.getComputer(ComputerType.PC, "100", "1000", "cpu");
		System.out.println(pc.getCPU());
	}
}
