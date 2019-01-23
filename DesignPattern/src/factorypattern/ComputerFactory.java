package factorypattern;

public class ComputerFactory {
	public static Computer getComputer(ComputerType type,String ram, String hdd, String cpu) {
		Computer comp = null;
		switch (type) {
		case PC:
			comp = new PC(ram, hdd, cpu);
			break;
		case SERVER:
			comp = new Server(ram, hdd, cpu);
			break;
		case SUPERCOMPUTER:
			comp = new SuperComputer(ram, hdd, cpu);
			break;
		}
		return comp;
	}
}
