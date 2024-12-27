package org.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,21,30,40,50);
        List<Integer> evenNumber = list.stream()
                .filter(n->n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
