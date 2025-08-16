

public class Array
{

    public static void main(String[] args)
    {
        String student1 = "Özge";
        String student2 = "Selena";
        String student3 = "Dilara";

        // Array Declaration
        String[] myCars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        String[] myPhones = new String[10];

        // Get Operation
        System.out.println(myCars[0]);                                       //Output:     Volvo

        // Set Operation
        myCars[0] = "Opel";

        // Print Array (it shows address)
        System.out.println(myCars);

        // Length of Array
        System.out.println(myCars.length);

        // Print All Array
        for (int i = 0; i < myCars.length; i++)
        {
            System.out.println(myCars[i]);
        }

        for (String i : myCars)
        {
            System.out.println(i);
        }

        // Change Array Length
        int lengthMyGames = 2;
        String[] myGames = new String[lengthMyGames];
        myGames[0]  = "The Witcher 3: Wild Hunt";
        myGames[1]  = "Gta 5";
        for (String i : myGames)
        {
            System.out.println(i);                                        //Output:     The Witcher 3: Wild Hunt
                                                                          //            Gta 5
        }

        lengthMyGames = 3;
        myGames = new String[lengthMyGames];                              // Yeni String array objesi oluşturuyor. (assign-initialize)
        myGames[2]  = "Forza Horizon 5";
        for (String i : myGames)
        {
            System.out.println(i);                                        //Output:     null
                                                                          //            null
                                                                          //            Forza Horizon 5
        }


    }

}
