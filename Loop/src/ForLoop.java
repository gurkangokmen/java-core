public class ForLoop
{


    public static void main(String[] args)
    {
        // 1.way
        for (int i = 0 ; i<10  ; i++)
        {
            System.out.println(i);
        }

        // 2.way
        for (int i = 0 ; i<10  ;)
        {
            System.out.println(i);
            i++;
        }


        // 3.way
        int i = 0;
        for (; i<10 ;)
        {
            System.out.println(i);
            i++;
        }
    }

}
