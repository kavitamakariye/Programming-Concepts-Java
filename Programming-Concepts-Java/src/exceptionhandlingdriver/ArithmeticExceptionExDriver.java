package exceptionhandlingdriver;

import java.util.Scanner;

import exceptionhandling.ArithmeticExceptionEx;

public class ArithmeticExceptionExDriver {

public static void main(String[] args) throws Exception {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number ");
		int n1 = scan.nextInt();
		System.out.println("Enter second number ");
		int n2 = scan.nextInt();
		scan.close();
		ArithmeticExceptionEx ariex = new ArithmeticExceptionEx();
		ariex.divide(n1, n2);
	}
}
