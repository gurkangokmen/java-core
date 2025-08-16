package base;
// same package subclass
public class Circle extends Shape {
    public Circle() {
        System.out.println("Circle constructor called");
    }

    public void displayFieldsAndMethods() {
        System.out.println(publicField);        // Accessible (inherited)
        System.out.println(protectedField);     // Accessible (inherited)
        System.out.println(defaultField);       // Accessible (inherited)
        // System.out.println(privateField);     // Not accessible from here
        
        publicMethod();							// Accessible (inherited)	
        protectedMethod();                      // Accessible (inherited)
        defaultMethod();                        // Accessible (inherited)
        // privateMethod();                      // Not accessible from here
    }
}
