package org.unfaithful.practice;

import java.util.List;

public class ConvertUpperCase {
    public static void main(String[] args) {
        List<String> names = List.of("ali", "veli", "ayşe");

        List<String> newNames = names.stream().map(name -> name.toUpperCase()).toList();
        System.out.println(newNames);
    }
}
