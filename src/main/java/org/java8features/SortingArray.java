package org.java8features;

import java.util.Arrays;

public class SortingArray {
    public static void main(String[] args) {
        int[] a = {1,2, 4 ,9 ,0};
        int[] ascending = Arrays.stream(a)
                .sorted()
                .toArray();
        System.out.println(Arrays.toString(ascending));

        int[] desscending = Arrays.stream(a)
                .boxed()
                .sorted((c,b)->b-c)
                .mapToInt(i->i)
                .toArray();
        System.out.println(Arrays.toString(desscending));
    }
}
