// Import the HashSet class
import java.util.HashSet;

public class Access {

	public static void main(String[] args) {
		HashSet<String> cars = new HashSet<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(findIfPresent("Ford",cars));
	    
	  }
	
	static String findIfPresent(String source, HashSet<String> set)
	{
	   if (set.contains(source)) {
	      for (String obj : set) {
	        if (obj.equals(source))
	          return obj;
	      }
	   }

	  return null;
	}

}
