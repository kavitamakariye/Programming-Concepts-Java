package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

	public void readDataFromFile(String filePath) throws FileNotFoundException {

		File fileObj = new File(filePath);
		Scanner scanObj = new Scanner(fileObj);

		while (scanObj.hasNext()) {
			String line = scanObj.nextLine();
			System.out.println(line);
		}
		scanObj.close();

	}


	public static void main(String[] args) throws FileNotFoundException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the full of File you wanna Read.");
		String filePath = scan.nextLine();
		scan.close();
		ReadFile readFile = new ReadFile();
		readFile.readDataFromFile(filePath);
	}
}
