import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String[] names = {"name1", "name2"};
        System.out.println(names);

        names = Arrays.copyOf(names, names.length+1);
        names[2] = "name3";

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
