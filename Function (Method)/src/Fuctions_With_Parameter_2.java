

public class Fuctions_With_Parameter_2
{
    public static void main(String[] args)
    {
        System.out.println(sum(4,3,1,2,10,80,111));
    }

    public static int sum(int... numbers)
    {

        int sum = 0;
        for (int number: numbers)
        {
            sum = sum + number;
        }
        return  sum;
    }
}