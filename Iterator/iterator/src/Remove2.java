// Import the ArrayList class and the Iterator class
import java.util.ArrayList;
import java.util.Iterator;

public class Remove2 {
	// Note: Trying to remove items using a for loop or a for-each loop would not work correctly because the collection is changing size at the same time that the code is trying to loop.
	public static void main(String[] args) {
	    ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(12);
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    Iterator<Integer> it = numbers.iterator();
	    for (Integer integer : it) { 
	    	//Can only iterate over an array or an instance of java.lang.Iterable
	    	//The enhanced for-each loop in Java can only be used with arrays or classes that implement the Iterable interface. However, the Iterator interface does not directly implement Iterable.			
		}
	    
	  }

}
