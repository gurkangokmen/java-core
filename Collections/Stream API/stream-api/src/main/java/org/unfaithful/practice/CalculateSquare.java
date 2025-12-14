package org.unfaithful.practice;

import java.util.List;

public class CalculateSquare {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> newNums = nums.stream().map(number -> number*number).toList();
        System.out.println(newNums);
    }
}
