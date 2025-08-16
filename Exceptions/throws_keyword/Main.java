package throws_keyword;

public class Main {

	public static void main(String[] args) {
		checkAge(15); // Set age to 15 (which is below 18...)
	}
	
	//The throws keyword indicates what exception type may be thrown by a method.
	static void checkAge(int age) throws ArithmeticException {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old."); //throw new Exception("Access denied - You must be at least 18 years old."); ==> error (!!!checked exception!!!)	      
	    }
	    
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }
	
	

}
