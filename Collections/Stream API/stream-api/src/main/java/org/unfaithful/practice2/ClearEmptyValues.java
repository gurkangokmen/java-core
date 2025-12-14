package org.unfaithful.practice2;

import java.util.Arrays;
import java.util.List;

public class ClearEmptyValues {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("java", "", null, "stream");

        List<String> result = words.stream()
                .filter(word -> word != null && !word.isEmpty())
                .toList();

        System.out.println(result);
    }
}
