package exceptionhandlingdriver;

import java.util.Scanner;
import exceptionhandling.ArithematicException;

public class ArithematicExceptionDriver {

public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number ");
		int n2 = scan.nextInt();
		scan.close();
		ArithematicException ariex = new ArithematicException();
		ariex.divide(n1, n2);
	}
}
