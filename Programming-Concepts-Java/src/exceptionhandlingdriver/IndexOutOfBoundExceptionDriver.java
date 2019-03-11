package exceptionhandlingdriver;

import java.util.Scanner;

import exceptionhandling.IndexOutOfBoundException;

public class IndexOutOfBoundExceptionDriver {

	public static void main(String[] args) {
		System.out.println("Enter the array index");
		Scanner scan = new Scanner(System.in);
		int index = scan.nextInt();
		scan.close();
		IndexOutOfBoundException inbo = new IndexOutOfBoundException();
		inbo.printIntAtIndex(index);
	}
}
 