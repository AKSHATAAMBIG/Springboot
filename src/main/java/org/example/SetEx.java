package org.example;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
    public static void main(String args[]){

        Set<String> s1 = new HashSet<>();
        s1.add("su");
        s1.add("ak");
        s1.add("mm");
        s1.add("mm");

        System.out.println(s1);
    }
}
