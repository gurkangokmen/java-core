package org.unfaithful.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class FilterPositiveNumbers {
    public static void main(String[] args) {
        int[] numbers = {-2, -1, 0, 3, 5, -4, 7};

        int[] result = Arrays
                .stream(numbers)
                .filter(
                        number -> number > 0
                )
                .toArray();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
