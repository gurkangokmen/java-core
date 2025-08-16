package throws_keyword;


// throw is used to throw an error, to create an error. 
// throws is used to declare that a method throws a <checked exception>.

// throw can only be used for one exception.
// We can declare multiple exceptions using throws keyword that can be thrown by the method. 
// For example, main() throws IOException, SQLException.

// throw must be used with throws for checked exceptions.

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
