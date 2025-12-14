package org.unfaithful.practice2;

import java.util.List;

public class ComputePowerOfEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> result = numbers.stream()
                .filter(number -> number%2==0)
                .map(number -> number*number)
                .toList();

        System.out.println(result);
    }
}
