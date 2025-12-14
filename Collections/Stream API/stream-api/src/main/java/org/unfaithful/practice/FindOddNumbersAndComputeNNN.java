package org.unfaithful.practice;

import java.util.Comparator;
import java.util.List;

public class FindOddNumbersAndComputeNNN {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9);
        List<Integer> result = numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(oddNUmber -> oddNUmber*oddNUmber*oddNUmber)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result);
    }
}
