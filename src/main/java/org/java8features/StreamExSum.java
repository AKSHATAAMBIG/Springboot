package org.java8features;

import java.util.Arrays;
import java.util.List;

public class StreamExSum {
    public static void main(String[] args) {
        List<Integer> lsum = Arrays.asList(1,2,4,5,6);
        int sum = lsum.stream()
                .reduce(0,Integer::sum);
        System.out.println(sum);
    }
}
