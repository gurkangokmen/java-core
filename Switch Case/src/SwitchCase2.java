public class SwitchCase2
{
    /*
      switch(expression)
      {
            case x:
              // code block
              // break;
            case y:
              // code block
              break;
            default:
              // code block
      }
    */

    /*
      The break Keyword:
      When Java reaches a break keyword, it breaks out of the switch block.
      This will stop the execution of more code and case testing inside the block.
      When a match is found, and the job is done, it's time for a break. There is no need for more testing.
      A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
    */

    /*
      The default Keyword:
      The default keyword specifies some code to run if there is no case match.
      Note that if the default statement is used as the last statement in a switch block, it does not need a break.
      Position/Location of default keyword is not important.
    */

    // case → ✔
    // case + default → ✔
    // default → ✔

    // break switch case durumunu sonlandırır.
    // break kullnılmadığında bütün switch case durumlarını kontrol eder.
    // We can use a break with the switch statement.
    // We can not use a continue with the switch statement.
    public static void main(String[] args)
    {
        int number = 6;
        switch (number)
        {
            case 1:  case 2:
            System.out.println("Number is 1 or 2.");
            break;

            case 3: case 4:
            System.out.println("Number is 3 or 4.");
            break;

            case 5:
                System.out.println("Number is 5");
                break;



            case 6: case 7: case 8:
            System.out.println("Number is 6 or 7 or 8.");
            break;

            default:
                System.out.println("Number is different than numbers in list.");
                break;

        }




    }



}
