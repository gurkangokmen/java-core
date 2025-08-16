package vector;

import java.util.Vector;

public class Size {

	public static void main(String[] args) {
		// Vector has same methods with ArrayList,LinkedList
		// Due to it is implemented from List interface
		
		// Create an Vector object
		Vector<String> cars = new Vector<String>();
				
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    

	    System.out.println(cars.size());
	}

}
