package abstraction;


//Abstract class
public abstract class Animal {
	public String name = "Diamond";
	protected String type = "Dog";
	private String genus = "Pretty Dog";	
	
	void eat(); // error: This method requires a body instead of a semicolon
	
	abstract void makeSound(); // abstract method
	
	// Regular method (public)
	public void sleep() {
	    System.out.println("Zzz");
	}
	
	// Regular method (protected)
	protected void reproductive() {
	    System.out.println("Reproductive");
	}
	
	// Default methods are allowed only in interfaces.
	
	/**
	default void myDefaultMethod() {
        // Some default logic
        privateNest();
        // More default logic
    }
    */	

    static void myStaticMethod() {
        // Some static logic
        privateNest();
        // More static logic
    }
    
    // Regular method (private)
	private static void privateNest() {
        // Common logic used by default and static methods
        System.out.println("Here is private nest for animal."); //It cannot generates any error, but we cannot use since it is private :D
    }
	

    
	

}
