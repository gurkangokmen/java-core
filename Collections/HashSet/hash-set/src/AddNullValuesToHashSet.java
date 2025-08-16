// Import the HashSet class
import java.util.HashSet;

/**
 * HashSet stores unique elements and permits nulls.
 */
public class AddNullValuesToHashSet {
    public static void main(String[] args) {


        // Create an HashSet object
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("BMW");
        cars.add(null);

        System.out.println(cars);
    }
}


