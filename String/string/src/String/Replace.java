package String;

public class Replace {

    public static void main(String[] args)
    {
        // Tanımlama
        String greeting = new String("Hello");

        // .replace(char oldChar, char newChar)
        System.out.println(greeting.replace("H","h"));                                                 //Output:             hello
        System.out.println(greeting);                                                                                   //Output:             Hello
    }
}
