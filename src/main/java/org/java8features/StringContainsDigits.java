package org.java8features;

public class StringContainsDigits {
    public static void main(String[] args) {
        String str = "9099";
        boolean isNumeric = str.chars()
                .allMatch(Character ::isDigit);
        System.out.println(isNumeric);
    }
}
