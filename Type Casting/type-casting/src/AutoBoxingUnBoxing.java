public class AutoBoxingUnBoxing {

    /**
    Autoboxing: primitive type -> wrapper class object

    Unboxing: wrapper class object -> primitive type
     */


    public static void main(String[] args) {
        // Autoboxing: converting primitive int to Integer object
        int num = 5;
        Integer boxedNum = num;  // Autoboxing

        // Unboxing: converting Integer object back to primitive int
        Integer anotherNum = new Integer(10);
        int unboxedNum = anotherNum;  // Unboxing
    }
}
