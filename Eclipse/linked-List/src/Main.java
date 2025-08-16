import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// The LinkedList class is almost identical to the ArrayList
		// The LinkedList class has all of the same methods as the ArrayList class because they both implement the List interface.
		// When To Use: Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
		
		
		// Some Additional Methods
		LinkedList<String> cars = new LinkedList<String>();
		cars.addFirst("Volvo");
	    cars.addLast("BMW");
	    cars.removeFirst();
	    cars.removeLast();
	    System.out.println(cars);

	    cars.addFirst("Volvo");
	    cars.addLast("BMW");	 
	    System.out.println(cars.getFirst());
	    System.out.println(cars.getLast());
	}

}
