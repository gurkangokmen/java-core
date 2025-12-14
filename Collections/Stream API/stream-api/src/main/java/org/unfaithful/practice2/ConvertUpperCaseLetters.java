package org.unfaithful.practice2;

import java.util.List;

public class ConvertUpperCaseLetters {
    public static void main(String[] args) {
        List<String> words = List.of("java", "stream", "api");
        List<String> result;
        result = words.stream()
                .map(word -> word.toUpperCase())
                .toList();

        System.out.println(result);
    }
}
