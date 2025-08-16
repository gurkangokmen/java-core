package enum_inside_class;

public class Main {
	enum Level {
	    LOW,
	    MEDIUM,
	    HIGH
	  }
	
	public static void main(String[] args) {
		Level myVar = Level.MEDIUM; 
	    System.out.println(myVar); // Output: MEDIUM

	}

}
