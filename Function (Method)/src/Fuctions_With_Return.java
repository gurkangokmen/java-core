

public class Fuctions_With_Return
{
    public static void main(String[] args)
    {

        System.out.println(printString());                                             //Output:                  printMessage is run.
        System.out.println(printInteger());                                            //Output:                  100
        System.out.println(printChar());                                               //Output:                  e
        System.out.println(printDouble());                                             //Output:                  100.1
        System.out.println(printFloat());                                              //Output:                  100.1
        System.out.println(printBoolean());                                            //Output:                  true
        System.out.println(printLong());                                               //Output:                  100
        System.out.println(printShort());                                              //Output:                  100
        System.out.println(printByte());                                               //Output:                  100
    }

    public static String printString()
    {
        return "printMessage is run.";
    }

    public static int printInteger()
    {
        return 100;
    }

    public static char printChar()
    {
        return 'e';
    }

    public static double printDouble()
    {
        return 100.1;
    }

    public static float printFloat()
    {
        return 100.1f;
    }

    public static boolean printBoolean()
    {
        return true;
    }

    public static long printLong()
    {
        return 100;
    }

    public static short printShort()
    {
        return 100;
    }

    public static byte printByte()
    {
        return 100;
    }
}
