import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Sort {

	public static void main(String[] args) {
	    ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    Collections.sort(cars);  // Sort cars
	    System.out.println(cars);
	    
	  }

}
