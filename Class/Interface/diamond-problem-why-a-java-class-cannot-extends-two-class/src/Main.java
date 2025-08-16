public class Main {
    public static void main(String[] args) {
        D d = new D();
        d.display();  // Error: Ambiguous method call
    }
}

/** Diamond Problem
 *      A
 *     / \
 *    B   C
 *     \ /
 *      D
 */