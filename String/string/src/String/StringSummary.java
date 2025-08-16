package String;

public class StringSummary
{

    public static void main(String[] args)
    {
        // Tanımlama
        String greeting = new String("Hello");
        String car = "Bmw";

        // Uzunluk
        System.out.println("The length of the greeting string is: " + greeting.length());               //Output:            5

        // toUpperCase() & toLowerCase()
        System.out.println(greeting.toUpperCase());                                                     // Output:           "HELLO"
        System.out.println(greeting.toLowerCase());                                                     // Output:           "hello"

        // Finding a starting index of a character in a String
        String cümle = "Please locate where 'locate' occurs!";

        // index numarasını baştan verir ve aramaya soldan başlar
        System.out.println(cümle.indexOf("locate"));                                                    //Output:             7

        // index numarasını baştan verir ama aramaya sağdan başlar
        System.out.println(cümle.lastIndexOf("locate"));                                                //Output:             21

        // .charAt()
        System.out.println("2. Eleman: " + greeting.charAt(1));                                         //Output:             e


        // .concat()
        System.out.println(greeting.concat(" World!"));                                                 //Output:             Hello World!
        System.out.println(greeting);                                                                   //Output:             Hello

        // .startsWith() & .endsWith()
        System.out.println(greeting.startsWith("H"));                                                   //Output:             true
        System.out.println(greeting.endsWith("o"));                                                     //Output:             true


        // .getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)
        char[] karakterler = new char[5];
        greeting.getChars(0,2, karakterler,0);
        System.out.println(karakterler);                                                                                //Output:             He


        // .replace(char oldChar, char newChar)
        System.out.println(greeting.replace("H","h"));                                                 //Output:             hello
        System.out.println(greeting);                                                                                   //Output:             Hello

        // .substring(int startIndex, int endIndex)
        System.out.println(greeting.substring(1));                                                            //Output:             ello
        System.out.println(greeting.substring(1,3));                                                                    //Output:             el

        // .split(String regex, int limit)
        String txt = "Bugün hava çok güzel!";
        System.out.println(txt.split(" ").getClass());                                                            //Output:             class [Ljava.lang.String; → single dimension String array
        for(String kelime: txt.split(" "))
        {
            System.out.println(kelime);
        }


        // .trim() → .trim() method eliminates leading and trailing spaces
        String game = " Star Wars Jedi: Fallen Order   ";
        System.out.println(game);                                                                      //Output:              Star Wars Jedi: Fallen Order
        System.out.println(game.trim());                                                               //Output:             Star Wars Jedi: Fallen Order
    }

}