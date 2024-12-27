package org.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamEx2 {
    public static void main(String[] args) {
        List<Integer> count = Arrays.asList(10,2,2,3,4);
        long c = count.stream()
                .filter(n-> n > 1 )
                .count();
        System.out.println(c);
    }
}
