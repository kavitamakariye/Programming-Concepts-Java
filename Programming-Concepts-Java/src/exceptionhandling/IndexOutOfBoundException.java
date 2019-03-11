package exceptionhandling;

public class IndexOutOfBoundException {

	int[] integers = {1,2,3,4};
	
		public void printIntAtIndex(int index) {
		try {	
			System.out.println("Integer at index "+index+": "+integers[index]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array size is "+ integers.length+". Please give a valid array index.");
		}
		finally {
			System.out.println("Exception Handled Successfully.");
		}
	}
	
}
