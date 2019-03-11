package exceptionhandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptions {

	public void readFile(String filePath) throws FileNotFoundException {
		
		try{
			File file = new File(filePath);
		    FileReader fileReader = new FileReader(file);
		    System.out.println(fileReader);
		}catch (FileNotFoundException e) {
			System.out.println("File path does not exits.");
		}finally {
			System.out.println("Successfully Handled FileNotFoundException.");
		}
	}
}
