package Principle;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

class Journal{
	private final List<String> entry = new ArrayList<>();
	private static int count = 0;
	
	public void addEntry(String text) {
		entry.add(""+ ++count+" "+text);
	}
	
	public void removeEntry(int index) {
		entry.remove(index);
	}
	
	@Override
	public String toString() {
		return String.join(System.lineSeparator(),entry);
	}
}

class Persistence{
	public void saveToFile(Journal journal,String fileName,boolean overRide) throws FileNotFoundException {
		try(PrintStream printStream = new PrintStream(fileName)) {
			if(overRide || new File(fileName).exists())
			printStream.println(journal);
		}
	}
}
 

public class SingleResponsibilityPrinciple {

	public static void main(String[] args) throws Exception{
		Journal journal = new Journal();
		journal.addEntry("durai");
		System.out.println(journal);
		
		Persistence persistence = new Persistence();
		persistence.saveToFile(journal, "D:\\Sathish\\durai.txt", true);
		
		Runtime.getRuntime().exec("notepad.exe "+"D:\\\\Sathish\\\\durai.txt");
	}

}
