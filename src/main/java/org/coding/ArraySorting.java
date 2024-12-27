package org.coding;

public class ArraySorting {
    public static void main(String[] args) {
        int[] a = {40,10,20,10,60};
        int temp = 0;
        for(int i=0;i<a.length;i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {//> asc < desc
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
            for (int i =0 ; i<a.length;i++){
                System.out.print(a[i]+" ");
            }
        }
    }
