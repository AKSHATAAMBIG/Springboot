package org.java8features;

import java.util.stream.Collectors;

public class StringRemoveDuplicates {
    public static void main(String[] args) {
        String str = "akshata";
        String str1 = str.chars()
                .distinct()
                .mapToObj(ch->String.valueOf((char)ch))
                .collect(Collectors.joining());
        System.out.println(str1);
    }
}
