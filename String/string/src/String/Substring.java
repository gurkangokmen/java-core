package String;

public class Substring {

    public static void main(String[] args)
    {
        // Tanımlama
        String greeting = new String("Hello");

        // .substring(int startIndex, int endIndex)
        System.out.println(greeting.substring(1)); //ello
        System.out.println(greeting.substring(1,3)); //el
    }
}
