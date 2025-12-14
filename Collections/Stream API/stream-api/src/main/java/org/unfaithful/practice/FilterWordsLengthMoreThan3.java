package org.unfaithful.practice;

import java.util.List;

public class FilterWordsLengthMoreThan3 {
    public static void main(String[] args) {
        List<String> words = List.of("car", "bus", "airplane", "ship");

        List<String> filteredWords = words.stream().filter(word -> word.length()>3).toList();
        System.out.println(filteredWords);
    }
}
