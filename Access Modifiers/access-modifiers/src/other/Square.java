// different package subclass
package other;
import base.Shape;

public class Square extends Shape{
	public Square() {
        System.out.println("Square constructor called");
    }

    public void displayFieldsAndMethods() {
        System.out.println(publicField);        // Accessible (inherited)
        System.out.println(protectedField);     // Accessible (inherited)
        // System.out.println(defaultField);       // Not accessible from here
        // System.out.println(privateField);     // Not accessible from here
        
        publicMethod();							// Accessible (inherited)	
        protectedMethod();                      // Accessible (inherited)
        // defaultMethod();                        // Not accessible from here
        // privateMethod();                      // Not accessible from here
    }
}
