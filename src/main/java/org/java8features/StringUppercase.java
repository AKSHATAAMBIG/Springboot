package org.java8features;

import java.util.stream.Collectors;

public class StringUppercase {
    public static void main(String[] args) {
        String str = "aksjua";
        String results = str.toUpperCase()
                .chars()
                .sorted()
                .mapToObj(ch->String.valueOf((char)ch))
                .collect(Collectors.joining());
        System.out.println(results);

    }
}
