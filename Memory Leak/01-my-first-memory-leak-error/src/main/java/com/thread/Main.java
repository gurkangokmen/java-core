package com.thread;

import java.util.HashMap;
import java.util.Map;


// Java Program to illustrate memory leaks

public class Main {
    // Simulates a memory leak by keeping strong references in a static Map
    private static final Map<Integer, String> leakMap = new HashMap<>();

    public static void main(String[] args) {
        // Simulate continuous addition to the map
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            // Adding objects to the map without removing them
            leakMap.put(i, "This is a test string: " + i);

            // Print every 1 million iterations to show progress
            if (i % 1_000_000 == 0) {
                System.out.println("Current size of leakMap: " + leakMap.size());
            }
        }
    }


}