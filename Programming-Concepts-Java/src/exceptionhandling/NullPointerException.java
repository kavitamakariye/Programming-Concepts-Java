package exceptionhandling;

public class NullPointerException {

	int integers[];

	public void printArray() {

			for(Integer num:integers) {
			 try {	
				System.out.println(num);
			}catch (RuntimeException e ) {
				System.out.println("Array is empty.");
			}finally {
				System.out.println("Successfully handled NullPointerException");
			}
		}
}

}
