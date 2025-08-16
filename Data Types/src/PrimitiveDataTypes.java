
public class PrimitiveDataTypes
{

    public static void main(String[] args)
    {
        /*
         * Syntax
         * data_type variable_name = value;
         */

        /*
         * Primitive Data Type: such as boolean, char, int, short, byte, long, float, and double
         * Non-Primitive Data Type or Object Data type: such as String, Array, Classes, Interface, etc.
         */


        // byte
        // 1 byte: The maximum decimal number that can be represented with 1 byte is 255 or 11111111.
        // -128 to 127
        byte myByte = -128;

        // short
        // 2 bytes
        // -32,768 to 32,767
        short myShort = 5;

        // integer
        // 4 bytes
        // -2,147,483,648 to 2,147,483,647
        int myNum = 5;


        // float
        // 4 bytes
        // 6 to 7 decimal digits
        //float myFloatNum = 1.1f;
        //float myFloatNum = 1.1F;
        //float myFloatNum = (float) 1.1;
        //float myFloatNum = 1.1d; //type casting from wide to narrrow don't realize automaticly

        // double
        // 8 bytes
        // 15 decimal digits
        //double myDoubleNum = 19.99;
        //double myDoubleNum = 19.99d;
        //double myDoubleNum = 19.99D;
        double myDoubleNum = 19.99; //type casting from narrow to wide realize automaticly


        // long
        // 8 bytes
        // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        //long myLong = 5l;
        //long myLong = 5L;
        long myLong = 5;
        System.out.println(myLong);


        // char
        // 2 bytes
        // all unicode characters
        char myChar = 'a';

        // boolean
        // 1 bit
        // true, false
        boolean myBool = true;
        boolean myBool2 = false;



    }
}