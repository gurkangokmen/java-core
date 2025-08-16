/*
 * A recursive function solves a particular problem
 * by calling a copy of itself and solving smaller subproblems of the original problems.
 */
public class Recursion
{
    public static void main(String[] args)
    {
        int result = sum(10);
        System.out.println(result);
    }
    public static int sum(int k)
    {
        if (k > 0)
        {
            return k + sum(k - 1);
        }
        else
        {
            return 0;
        }
    }
}