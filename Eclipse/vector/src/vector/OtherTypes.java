package vector;

import java.util.Vector;

public class OtherTypes {
	// int - Integer
	// double - Double
	// char - Character
	// boolean - Boolean 
	public static void main(String[] args) {
		// Vector has same methods with ArrayList,LinkedList
		// Due to it is implemented from List interface
		
		// Create an Vector object
		Vector<Integer> myNumbers = new Vector<Integer>();
				
	    myNumbers.add(10);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(25);
	    
	    for (int i : myNumbers) {
	      System.out.println(i);
	    }
	  }

}
