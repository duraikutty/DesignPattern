package singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeIssue {
	static void saveToFile(Logger logger, String fileName) throws Exception {
		try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(logger);
		}
	}

	static Logger readFromFile(String fileName) throws Exception {
		try (FileInputStream fileInputStream = new FileInputStream(fileName);
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Logger) objectInputStream.readObject();
		}
	}

	public static void main(String[] args) throws Exception {

		Logger logger1 = Logger.getInstance();
		logger1.setI(10);

		String fileName = "durai.txt";
		saveToFile(logger1, fileName);

		Logger logger2 = readFromFile(fileName);
		System.out.println(logger1.hashCode());
		System.out.println(logger2.hashCode());
		
		

	}

}
