package org.example.collection;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map1 {
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(4,"akk");
        m1.put(2,"kkk");
        m1.put(3,"jjj");


        Map<Integer,String > n = new TreeMap<>(Collections.reverseOrder());
        n.putAll(m1);
        for(Map.Entry<Integer,String> n1 : n.entrySet()){
            System.out.println(n1.getKey() + " " + n1.getValue());
        }
    }
}
