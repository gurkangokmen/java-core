package vector;

import java.util.Collections;  // Import the Collections class
import java.util.Vector;

public class Sort {

	public static void main(String[] args) {
		// Create an Vector object
		Vector<String> cars = new Vector<String>();
		
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Collections.sort(cars);  // Sort cars
	    
	    System.out.println(cars);
	    
	  }

}
