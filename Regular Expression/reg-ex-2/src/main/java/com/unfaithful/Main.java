package com.unfaithful;

import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String regex = "excute sql failed: relation \"[^/]+\" does not exist.";
        String input = "excute sql failed: relation \"public.test\" does not exist. d2e412dasd";

        if (Pattern.compile(regex).matcher(input).find()) {
            System.out.println("Matched");
        } else {
            System.out.println("Not matched");
        }
    }
}
