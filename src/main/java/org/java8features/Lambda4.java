package org.java8features;

import java.util.Arrays;
import java.util.List;

public class Lambda4 {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("akshy","sudhu","jeni");
        list1.forEach(System.out::println);
    }
}
