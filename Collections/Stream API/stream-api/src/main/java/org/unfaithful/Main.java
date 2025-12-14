package org.unfaithful;


import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,6,7,8,9,10);

        // filter
        numbers.stream().filter(x -> x > 10);

        // map
        numbers.stream().map(x -> x*2);

    }
}