package org.example;

public class ArrayHandson {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 3, 3, 3};
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("Using for each:");
        for(int b:a){
            System.out.println(b);
        }
    }

}
