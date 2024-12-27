package org.java8features;

public class StringOccurance {
    public static void main(String[] args) {
        String str = "akshta";
        long count = str.chars()//string into stream of characters
                .filter(ch->ch == 'a')
                .count();
        System.out.println(count);
    }
}
