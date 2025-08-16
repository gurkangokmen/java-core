// Import the HashSet class
import java.util.HashSet;

public class Add {
	
	//It is an implementation of a hash set, which is similar to a HashMap but contains only unique elements (no duplicate values).
	public static void main(String[] args) {
	    HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars);
	  }
}
