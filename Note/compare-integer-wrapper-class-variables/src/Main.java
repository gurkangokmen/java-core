public class Main {
    public static void main(String[] args) {
        // IntegerCache -128 to 127

        // ALL THE BELOW TESTS WILL PASS
        int f1 = 10, s1 = 10;
        int f2 = -128, s2 = -128;
        int f3 = 127, s3 = 127;
        int f4 = 128, s4 = 128;

        if (f1 == s1) {
            System.out.println("test- 11: Passed");
        }

        if (f2 == s2) {
            System.out.println("test- 12: Passed");
        }

        if (f3 == s3) {
            System.out.println("test- 13: Passed");
        }

        if (f4 == s4) {
            System.out.println("test- 14: Passed");
        }

        Integer fo1 = 10, so1 = 10;
        Integer fo2 = -128, so2 = -128;
        Integer fo3 = 127, so3 = 127;
        Integer fo4 = 128, so4 = 128;

        if (fo1 == so1) {
            System.out.println("test- 21: Passed");
        }

        if (fo2 == so2) {
            System.out.println("test- 22: Passed");
        }

        if (fo3 == so3) {
            System.out.println("test- 23: Passed");
        }

        if (fo4 == so4) {
            System.out.println("test- 24: Passed");
        }

        Integer foo1 = new Integer(10);
        Integer soo1 = new Integer(10);

        Integer foo2 = new Integer(-128);
        Integer soo2 = new Integer(-128);

        Integer foo3 = new Integer(127);
        Integer soo3 = new Integer(127);

        Integer foo4 = new Integer(128);
        Integer soo4 = new Integer(128);

        if (foo1 == soo1) {
            System.out.println("test- 31: Passed");
        }

        if (foo2 == soo2) {
            System.out.println("test- 32: Passed");
        }

        if (foo3 == soo3) {
            System.out.println("test- 33: Passed");
        }

        if (foo4 == soo4) {
            System.out.println("test- 34: Passed");
        }


    }
}