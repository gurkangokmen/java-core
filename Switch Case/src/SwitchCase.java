public class SwitchCase
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
    */

    // case → ✔
    // case + default → ✔
    // default → ✔

    // break switch case durumunu sonlandırır.
    // break kullanılmadığında bütün switch case durumlarını kontrol eder.
    // We can use a break with the switch statement.
    // We can not use a continue with the switch statement.
    // Position/Location of default keyword is not important.
    public static void main(String[] args)
    {
        int day = 7;
        switch (day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
           default:
                System.out.println("default is run.");
                break;
            case 7:
                System.out.println("Sunday");
                break;


        }




    }



}
