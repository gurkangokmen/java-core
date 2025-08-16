public class MultiDimensionalArray
{

    public static void main(String[] args)
    {
        // Array Declaration
        String[][] myGames = { {"The Witcher 3: Wild Hunt", "Gta 5", "Forza Horizon 5", "60 Seconds"}, {"Brawl Stars", "Clash Of Clans", "Clash Royale"} };
        String[][] myLovers = new String[3][5];

        // Get Operation
        System.out.println(myGames[0]);                                       //Output:     Adres
        System.out.println(myGames[0][0]);                                    //Output:     The Witcher 3: Wild Hunt
        System.out.println(myGames[0][1]);                                    //Output:     Gta 5

        // Set Operation
        myGames[0][0] = "A Plague Tale: Innocence";

        // Print Array (it shows address)
        System.out.println(myGames);

        // Length of Array
        System.out.println(myGames.length);                                   //Output:     2
        System.out.println(myGames[0].length);                                //Output:     4
        System.out.println(myGames[1].length);                                //Output:     3

        // Print All Array
        for (int i = 0; i < myGames.length; i++)
        {
            System.out.println("- - - - - - - - - -");
            for (int j = 0; j < myGames[i].length; j++)
            {
                System.out.println(myGames[i][j]);
            }
        }

        for (String[] i : myGames)
        {
            System.out.println("- - - - - - - - - -");
            for (String j : i)
            {
                System.out.println(j);
            }
        }

        // Change Array Length
        int lengthMyCars = 2;
        int lengthMyCars2 = 3;
        String[][] myCars = new String[lengthMyCars][lengthMyCars2];
        myCars[0][0]  = "Opel";
        myCars[0][1]  = "Bmw";
        myCars[1][0]  = "Benz Mercedes";
        myCars[1][1]  = "Volvo";
        myCars[1][2]  = "Tesla";
        for (String[] i : myCars)
        {
            System.out.println("- - - - - - - - - -");
            for (String j : i)
            {
                System.out.println(j);
            }
        }

        lengthMyCars = 3;
        lengthMyCars2 = 4;
        myCars = new String[lengthMyCars][lengthMyCars2];                             // Yeni String array objesi oluşturuyor. (eski değerler yok)
        myCars[2][0]  = "Forza Horizon 5";

        for (String[] i : myCars)
        {
            System.out.println("- - - - - - - - - -");
            for (String j : i)
            {
                System.out.println(j);
            }
        }
    }

}
