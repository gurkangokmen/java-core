package String;

public class Split {

    public static void main(String[] args)
    {
        // .split(String regex, int limit)
        String txt = "Bugün hava çok güzel!";


        System.out.println(txt.split(" ").getClass());  //Output:             class [Ljava.lang.String; → single dimension String array

        /*[ stands for single dimension array
        Ljava.lang.String stands for the string class (L followed by class/interface name)

        List of notations:
        Element Type : Notation
        boolean : Z
        byte : B
        char : C
        class or interface : Lclassname
        double : D
        float : F
        int : I
        long : J
        short : S*/

        for(String kelime: txt.split(" "))
        {
            System.out.println(kelime);
        }
        // Output:
        // Bugün
        // hava
        // çok
        // güzel!
    }
}
