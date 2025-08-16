// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

//
// Iterator
//

// An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet. 
public class Create {
	public static void main(String[] args) {

	    // Make a collection
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");

	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
	    System.out.println(it.next());
	    System.out.println(it.next());
	  }
}
