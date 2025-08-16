package String;

public class JavaSpecialCharacters {
    public static void main(String[] args)
    {
        //The solution to avoid this problem, is to use the backslash escape character(/).


        //String txt = "We are the so-called "Vikings" from the north.";                                                //error
        String txt1 =  "We are the so-called \"Vikings\" from the north.";                                              //Output: We are the so-called "Vikings" from the north.
        String txt2 =  "It's alright.";                                                                                 //Output: It's alright.
        String txt3 =  "The character \\ is called backslash.";                                                         //Output: The character \ is called backslash.



        System.out.println("In the depths of my heart, \nlove for Judy Alvarez burns brighter than a thousand stars.");
        // Output:
        //In the depths of my heart,
        //love for Judy Alvarez burns brighter than a thousand stars.

        System.out.println("In the depths of my heart, love for Judy Alvarez burns \rbrighter than a thousand stars.");
        // Output:
        //brighter than a thousand stars.

        System.out.println("Gita is going to Market\rS ");
        // Output:
        //S

        System.out.println("In the depths of my heart, love for Judy Alvarez burns \tbrighter than a thousand stars.");
        // Output:
        //In the depths of my heart, love for Judy Alvarez burns 	brighter than a thousand stars.

        System.out.println("In the depths of my heart, love for Judy Alvarez burns \bbrighter than a thousand stars.");
        // Output:
        //In the depths of my heart, love for Judy Alvarez burnsbrighter than a thousand stars.

        System.out.println("In the depths of my heart, love for Judy Alvarez burns \fbrighter than a thousand stars.");
        // Output:
        //In the depths of my heart, love for Judy Alvarez burns brighter than a thousand stars.

        /**


        \n	New Line
        \r	Carriage Return
        \t	Tab
        \b	Backspace
        \f	Form Feed

         **/






    }
}
