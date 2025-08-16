// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Loop {

	public static void main(String[] args) {

	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Looping Through a Collection
	    while(it.hasNext()) {
	    	  System.out.println(it.next());
	    	}
	  }

}
