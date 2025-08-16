/**
 * We cannot use primitives as type parameters
 */
public class Main {
    public static void main(String[] args) {

        Pair<String,Integer> p1 = new Pair<>("Unfaithful", 7268);
        System.out.println(p1.key + " " + p1.value);
    }
}