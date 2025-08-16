public class Functions_Overloading {

    public static void main(String[] args)
    {
        sum(1,1);
        sum(1,1,1);
    }

    public static void sum(int number1, int number2)
    {
        System.out.println(number1+number2);
    }

    public static void sum(int number1, int number2, int number3)
    {
        System.out.println(number1+number2+number3);
    }
}
