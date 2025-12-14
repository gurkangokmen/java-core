package org.unfaithful.practice2;

import java.util.List;

public class FindPositiveNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(-2, -1, 0, 3, 5, -4, 7);

        List<Integer> result = numbers.stream().filter(
                number -> number>0
        ).toList();

        System.out.println(result);
     }
}
