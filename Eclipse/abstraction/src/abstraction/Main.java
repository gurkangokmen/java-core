package abstraction;


public class Main {

	public static void main(String[] args) {
		//
		// We cannot create object from abstract class
		//
		
		//Animal myObj = new Animal(); 
		
		
		Dog myPig = new Dog(); // Create a Pig object
	    myPig.makeSound();
	    myPig.sleep();
	    myPig.reproductive();
	}

}
