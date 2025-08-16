/**
 * We cannot use primitives as type parameters
 */

public class Main {
    public static void main(String[] args) {
        Solution<Integer> solution = new Solution<>(10);
        System.out.println(solution.value);

        Solution<String> solution2 = new Solution<>("Hello");
        System.out.println(solution2.value);

        Solution<Double> solution3 = new Solution<>(10.5);
        System.out.println(solution3.value);

        Solution<Boolean> solution4 = new Solution<>(true);
        System.out.println(solution4.value);

        Solution<Character> solution5 = new Solution<>('A');
        System.out.println(solution5.value);

        Solution<Float> solution6 = new Solution<>(10.5f);
        System.out.println(solution6.value);

        Solution<Long> solution7 = new Solution<>(1000000000L);
        System.out.println(solution7.value);

        Solution<Short> solution8 = new Solution<>((short) 10);
        System.out.println(solution8.value);

        Solution<Byte> solution9 = new Solution<>((byte) 10);
        System.out.println(solution9.value);

    }
}