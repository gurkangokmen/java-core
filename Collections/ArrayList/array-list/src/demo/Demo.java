package demo;

import java.util.ArrayList;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("B");
        list.add("-a");
        Collections.sort(list);
        list.forEach(s -> System.out.println(s));
    }
}
