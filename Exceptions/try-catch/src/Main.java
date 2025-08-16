
public class Main {
	// try - catch - finally → ✅
	// try - catch  → ✅
	// try - finally → ✅
	// try → ❌
	// catch → ❌
	// finally → ❌
	public static void main(String[] args) {
		
		try {
		      //  Block of code to try
		      int[] myNumbers = {1, 2, 3};
		      System.out.println(myNumbers[10]);
		    } 
	    
		catch (Exception e) {
		      //  Block of code to handle errors
		      System.out.println("Something went wrong. :" + e);
		    } 
	    
		finally {
		      //  Block of code is always run
		      System.out.println("The 'try catch' is finished.");
		    }
	  }
}
