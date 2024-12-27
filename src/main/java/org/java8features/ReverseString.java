package org.java8features;

public class ReverseString {
    public static void main(String[] args) {
        String str = "akshata";
        String reverse = new StringBuilder(str)
                .reverse()
                .toString();
        System.out.println(reverse);
    }
}
