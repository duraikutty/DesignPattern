package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

enum EnumBasedSingleton{
	INSTANCE;
	private int value;
	private EnumBasedSingleton() {
		value = 10;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
public class EnumBasedSingletonDemo {
	static void saveToFile(EnumBasedSingleton singleton, String fileName) throws Exception {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(singleton);
		}
	}

	static EnumBasedSingleton readFromFile(String fileName) throws Exception {
		try (FileInputStream fileInputStream = new FileInputStream(fileName);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (EnumBasedSingleton) objectInputStream.readObject();
		}
	}
	public static void main(String[] args) throws Exception{
		EnumBasedSingleton singleton1 = EnumBasedSingleton.INSTANCE;
		String fileName = "durai.txt";
		singleton1.setValue(1000);
		saveToFile(singleton1, fileName);
		//singleton1.setValue(2000);
		EnumBasedSingleton singleton2 = readFromFile(fileName);
		System.out.println(singleton2.getValue());
		
		System.out.println(singleton1.getValue());

	}
}
