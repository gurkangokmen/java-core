public class Main {
    public static void main(String[] args) {
        //int - double (automatically)

        int num1 = 10;
        double num2 = num1;  // Widening casting from int to double
        System.out.println(num2); //10.0

        //double - int (manually)

        double numb1 = 10.5;
        int numb2 = (int) numb1;  // Narrowing casting from double to int
        System.out.println(numb2); //10

        //int - float

//        int number1 = 10;
//        float number2 = number1;
//        System.out.println("10(int) is converted to (float)" + number2); //10.0

        //float - int

//        float number1 = (float) 10.0;
//        int number2 = (int) number1;
//        System.out.println("10.0(float) is converted to (int)" + number2); //10

        //int - byte

//        int number1 = 10;
//        byte number2 = (byte) number1;
//        System.out.println("10(int) is converted to (byte)" + number2); //10

        //int - boolean

//        int number1 = 1;
//        boolean number2 =  (boolean) number1; //Inconvertible types; cannot cast 'int' to 'boolean'

        //boolean - int

        //boolean expression1 = true;
        //int number1 =  (int) expression1; //Inconvertible types; cannot cast 'boolean' to 'int'

//        boolean flag = true;
//        int intValue = flag ? 1 : 0;
//        System.out.println(intValue);  // Output: 1


        //int - String

//        int num = 42;
//        String strNum = Integer.toString(num);
//        System.out.println(strNum);  // Output: "42"

//        int num = 42;
//        String strNum = "" + num;
//        System.out.println(strNum);  // Output: "42"

        //String - int

//        String strNum = "42";
//        int num = Integer.parseInt(strNum);
//        System.out.println(num);  // Output: 42

        String strNum = "42";
        Integer objNum = Integer.valueOf(strNum);
        int num = objNum.intValue();  // Unboxing to get the int value
        System.out.println(num);  // Output: 42 - int
        System.out.println(objNum);  // Output: 42 - Integer
        System.out.println(objNum+8); // Output: 50






    }


}