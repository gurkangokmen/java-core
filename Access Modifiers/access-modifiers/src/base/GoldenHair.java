package base;
// same package non-subclass
public class GoldenHair {
	public GoldenHair() {
        System.out.println("GoldenHair constructor called");
    }

    public void displayFieldsAndMethods() {
    	
        // System.out.println(publicField);        // Not Accessible (not inherited)
        // System.out.println(protectedField);     // Not Accessible (not inherited)
        // System.out.println(defaultField);       // Not Accessible (not inherited)
        // System.out.println(privateField);     // Not accessible from here
        
        // publicMethod();							// Not Accessible (not inherited)	
        // protectedMethod();                      // Not Accessible (not inherited)
        // defaultMethod();                        // Not Accessible (not inherited)
        // privateMethod();                      // Not accessible from here
        
        Shape myShape = new Shape();
        
        System.out.println(myShape.publicField);        // Accessible (created object)
        System.out.println(myShape.protectedField);     // Accessible (created object)
        System.out.println(myShape.defaultField);       // Accessible (created object)
        // System.out.println(myShape.privateField);     // Not accessible from here
        
        myShape.publicMethod();							// Accessible (created object)
        myShape.protectedMethod();                      // Accessible (created object)
        myShape.defaultMethod();                        // Accessible (created object)
        // myShape.privateMethod();                      // Not accessible from here
    }
    
    
}
