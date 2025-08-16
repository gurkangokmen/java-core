public class Append {
    public static void main(String[] args) {
        // Define a StringBuffer
        StringBuffer sb = new StringBuffer("Hello");

        // Print the StringBuffer
        System.out.println(sb); // Output: Hello

        // Append a string to the StringBuffer
        sb.append(" World!");
        System.out.println(sb); // Output: Hello World!
    }
}
