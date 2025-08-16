public class Main {
    public static void main(String[] args) {

        // THEY HAVE SAME MEMORY ADDRESS
        String message = "Hello World";
        String message2 = "Hello World";

        System.out.println(message == message2); // true
        System.out.println(message.equals(message2)); // true


        // THEY HAVE DIFFERENT MEMORY ADDRESS
        String message3 = new String("Hello World");
        String message4 = new String("Hello World");

        System.out.println(message3 == message4); // false
        System.out.println(message3.equals(message4)); // true
    }
}