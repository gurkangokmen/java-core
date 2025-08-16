public class Main {
    public static void main(String[] args) {
        Person myObj = new Person();

        //
        // Error
        //
        myObj.name = "John";  // error
        System.out.println(myObj.name); // error

        //
        // Solution, We must use get method!
        //
        System.out.println(myObj.getName()); // No error


    }
}