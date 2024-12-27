package org.java8features;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Array32 {
    public static void main(String[] args) {
        int a[] = {1,2,0,3,4,5,6};
        int b[] = IntStream.concat(
                Arrays.stream(a).filter(n-> n == 0),
                        Arrays.stream(a).filter(n->n != 0))
                .toArray();
        System.out.println(Arrays.toString(b));
    }
}
