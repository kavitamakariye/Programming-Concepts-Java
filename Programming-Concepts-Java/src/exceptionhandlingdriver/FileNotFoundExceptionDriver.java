package exceptionhandlingdriver;

import java.io.FileNotFoundException;

import java.util.Scanner;

import exceptionhandling.FileNotFoundExceptions;

public class FileNotFoundExceptionDriver {

	public static void main(String[] args) throws FileNotFoundException {
		
		System.out.println("Enter file path");
		Scanner scan = new Scanner(System.in);
		String filePath = scan.next();
		scan.close();
		FileNotFoundExceptions fileex = new FileNotFoundExceptions();
		fileex.readFile(filePath);;
	}
}
