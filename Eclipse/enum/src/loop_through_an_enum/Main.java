package loop_through_an_enum;

import java.util.Iterator;

enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

public class Main {
	
	// The enum type has a values() method, which returns an array of all enum constants. 
	public static void main(String[] args) {
		for (Level myVar : Level.values()) {
			  System.out.println(myVar);
			}
		
		//
		// Output:
		//
		
		// LOW
		// MEDIUM
		// HIGH

	}

}
