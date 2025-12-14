package org.unfaithful.practice2;

import java.util.List;

public class WordsLengthMoreThan5 {
    public static void main(String[] args) {

        List<String> words = List.of("apple", "banana", "kiwi", "mango");

        List<String> result = words.stream()
                .filter(
                        word -> word.length()>5
                )
                .toList();

        System.out.println(result);
    }
}
