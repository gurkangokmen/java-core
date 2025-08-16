public class MyClass {

    // Static variable
    static String message;

    // Static initialization block
    static {
        message = "Hello world!";
    }

    // Constructor
    public MyClass() {
        message = "Hello from constructor!";
    }
}
