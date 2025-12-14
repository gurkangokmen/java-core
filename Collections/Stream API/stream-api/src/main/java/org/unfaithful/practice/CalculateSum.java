package org.unfaithful.practice;

import java.util.List;

public class CalculateSum {
    public static void main(String[] args){
        List<Integer> numbers = List.of(3, 6, 9, 12);

        numbers.stream().mapToInt(number -> number).sum();
    }
}
