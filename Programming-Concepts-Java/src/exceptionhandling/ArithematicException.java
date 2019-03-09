package exceptionhandling;

public class ArithematicException {

public void divide(int n1, int n2) throws Exception{		
		
		try{	// try block should only be used on only specific line of code which can throw exception
			System.out.println("Division of " + n1 + " and " + n2 + " is: " + n1/n2);
		}
		catch(ArithmeticException arithmeticException){
			if(n2==0) {
			System.out.println("Cannot divide by 0");
			}else if(n2<0) {
				System.out.println("Denominator cannot be negative");
			}
			//throw new Exception("divie (int n1, int n2) operation failed.");// This is to get the error message as well. If we add this link of code we need add "throws Exception" to the same method and to the driver class.
		}
		catch(Exception exception){			// Exception should be written below all other exceptions because it will not allow the exception to go below it
			System.out.println(exception.getMessage());	// catch block is only executed only if exception is caught
		}
		finally{
			System.out.println("End of program");// Finally block is executed no matter what i.e. it is executed if there isn't any exception and also if there is exception 
		}
	}
}
