package vector;

import java.util.Vector;

public class Remove {

	public static void main(String[] args) {
		// Vector has same methods with ArrayList,LinkedList
		// Due to it is implemented from List interface
		
		// Create an Vector object
		Vector<String> cars = new Vector<String>();
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    cars.remove(0);

	    System.out.println(cars);
	}

}
