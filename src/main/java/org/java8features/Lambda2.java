package org.java8features;

import java.util.Comparator;

public class Lambda2 {
    public static void main(String[] args) {
        Comparator<Integer> comparator = (o1, o2) -> o1.compareTo(o2);
            System.out.println(comparator.compare(30, 20));
    }
}
