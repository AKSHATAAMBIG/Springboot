package org.java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamEx {
    public static void main(String[] args) {
        List<String> l1 = Arrays.asList("alice","Bob","Ravi");
        Optional<String> firstName = l1.stream()
                .filter(n->n.startsWith("a"))
                .findFirst();
        firstName.ifPresent(System.out::println);
    }
}
