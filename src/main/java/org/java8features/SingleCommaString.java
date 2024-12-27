package org.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SingleCommaString {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("aksj","lklk","popo");
        String l2 = l1.stream()
                .collect(Collectors.joining(","));
        System.out.println(l2);
    }
}
