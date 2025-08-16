public class Main {
    public static void main(String[] args)
    {


        // Reference Type
        int[] numbers1 = new int[] {1,2,3};
        int[] numbers2 = new int[] {4,5,6};
        numbers2 = numbers1;

        for (int number : numbers2)
        {
            System.out.println(number);                           //Output:                 1
                                                                  //                        2
                                                                  //                        3
        }


        numbers1[0] = 10;
        System.out.println(numbers2[0]);                          //Output:                 10
    }
}
