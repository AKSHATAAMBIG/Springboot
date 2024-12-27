package org.java8features;

import java.util.Arrays;

public class ArraysProgram1 {
    public static void main(String[] args) {
        int[] a = {1, 3 , 5, 7, 8, 9};
        int max = Arrays.stream(a)
                .max()
                .getAsInt();
        System.out.println(max);

        int min =Arrays.stream(a)
                .min()
                .getAsInt();
        System.out.println(min);

    }
}
