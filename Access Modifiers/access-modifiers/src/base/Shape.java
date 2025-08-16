package base;
public class Shape {
    // Public field
    public String publicField = "This is a public field";

    // Protected field
    protected String protectedField = "This is a protected field";

    // Default (package-private) field
    String defaultField = "This is a default field";

    // Private field
    private String privateField = "This is a private field";

    // Public constructor
    public Shape() {
        System.out.println("Shape constructor called");
    }
    
    // Public method
    public void publicMethod() {
        System.out.println("Public method");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    // Default (package-private) method 
    void defaultMethod() {
        System.out.println("Default method");
    }

    // Private method
    private void privateMethod() {
        System.out.println("Private method");
    }
}
