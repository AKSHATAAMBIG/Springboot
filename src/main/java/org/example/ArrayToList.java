package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToList {
    public static  void main(String args[]){

        int[] arr = {1,2,4,5,6,7,7};
        //System.out.println(Arrays.toString(arr));

        List<Integer> l1 = new ArrayList<>();
        for(int l : arr){
            l1.add(l);
        }

        System.out.println(l1);


    }
}
