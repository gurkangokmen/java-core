public class BitwiseOperator {
    public static void main(String[] args){
        bitwiseAnd();
        bitwiseOr();

    }

    public static void bitwiseOr(){
        // Bitwise OR (|) Operator
        // Compares each bit of two numbers and returns 1 if at least one of the bits is 1.
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a | b; // 0111 -> 7 in decimal
        System.out.println(result); // Output: 7
    }

    public static void bitwiseAnd(){
        // Bitwise AND (&) Operator
        // Compares each bit of two numbers and returns 1 if both bits are 1; otherwise, it returns 0.
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary
        int result = a & b; // 0001 -> 1 in decimal
        System.out.println(result); // Output: 1
    }
}
