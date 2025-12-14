package org.unfaithful.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FindWordHaveMostLength {
    public static void main(String[] args) {
        List<String> words = List.of("java", "spring", "microservices", "api");
        Optional<String> x = words.stream().max(Comparator.comparingInt(String::length));

        System.out.println(x.get());
    }
}
