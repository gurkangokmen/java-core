package String;

public class BreakAndContinue {
    public static void main(String[] args)
    {

        //break
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
        // 0
        // 1
        // 2
        // 3

        //continue
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue; //for'un başına atar.
                //System.out.println("if block");
            }
            System.out.println(i);
        }
        // 0
        // 1
        // 2
        // 3
        // 5
        // 6
        // 7
        // 8
        // 9

    }


}
