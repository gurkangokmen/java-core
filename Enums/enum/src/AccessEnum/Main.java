package AccessEnum;

import AccessEnum.Level;

public class Main {

	public static void main(String[] args) {
		// Create and access
        AccessEnum.Level myVar = AccessEnum.Level.MEDIUM;
		System.out.println(myVar);
		
		// Assign (error)
		//Level.LOW = Level.MEDIUM; // Compilation error: Cannot assign a value to final variable


		// Print
		System.out.println(create_enum.Level.LOW);
		System.out.println(create_enum.Level.LOW.values());
		System.out.println(Level.LOW.name());

	}

}
