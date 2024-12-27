package org.example.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        l1.add("akk");
        l1.add("aaa");

        //Collections.sort(l1);
        //System.out.println(l1.remove(0));
//        for(int i=0;i<l1.size();i++){
//            System.out.println(l1.get(0));
//        }

        Collections.reverse(l1);
        for(String a: l1){
            System.out.println(a);
        }

    }
}
