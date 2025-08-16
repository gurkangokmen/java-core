package create_enum;

public class Main {

	public static void main(String[] args) {
		// Create and access
		Level myVar = Level.MEDIUM;
		System.out.println(myVar);
		
		// Assign (error)
		Level.LOW = Level.MEDIUM; // Compilation error: Cannot assign a value to final variable	

	}

}
