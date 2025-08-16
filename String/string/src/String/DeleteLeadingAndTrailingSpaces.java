package String;

public class DeleteLeadingAndTrailingSpaces {

    public static void main(String[] args)
    {
        // .trim() → .trim() method eliminates leading and trailing spaces
        String game = " Star Wars Jedi: Fallen Order   ";
        System.out.println(game);                                                                                       //Output:              Star Wars Jedi: Fallen Order
        System.out.println(game.trim());                                                                                //Output:             Star Wars Jedi: Fallen Order
    }
}
