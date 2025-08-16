import java.util.ArrayList;

public class Clear {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    
	    cars.clear();

	    System.out.println(cars);
	}

}
