package String;

public class Index {
    public static void main(String[] args)
    {
        // Finding a starting index of a character in a String
        String sentence = "Please locate where 'locate' occurs!";

        // index numarasını baştan verir ve aramaya soldan başlar
        System.out.println(sentence.indexOf("locate"));                                                    //Output:             7

        // index numarasını baştan verir ama aramaya sağdan başlar
        System.out.println(sentence.lastIndexOf("locate"));                                            //Output:             21

        // .charAt()
        System.out.println("2. Eleman: " + sentence.charAt(1));                                            //Output:             2. Eleman: l


        // Tanımlama
        String greeting = new String("Hello");

        // .startsWith() & .endsWith()
        System.out.println(greeting.startsWith("H"));                                                     //Output:             true
        System.out.println(greeting.endsWith("o"));                                                       //Output:             true


        // .getChars(int srcBegin, int srcEnd, char[] dst,  int dstBegin)
        char[] karakterler = new char[5];
        System.out.println(karakterler.getClass().getName());                                              //[C
        greeting.getChars(0,3, karakterler,2);
        System.out.println(karakterler);                                                                   //Output:              Hel
    }
}
