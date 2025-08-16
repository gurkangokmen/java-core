/**
 * <h1>Order</h1>
 * <p> 1. fields
 * <p> 2. static block
 * <p> 3. constructor
 */

/*
   USAGE:
   1️⃣ Used for initializing static variables.
   2️⃣ Used for performing complex setup that only needs to be done once per class, such as loading configuration settings, initializing static resources, or connecting to a database.
*/


public class Main {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        System.out.println(myClass.message);
        // Output: Hello from constructor!
    }
}