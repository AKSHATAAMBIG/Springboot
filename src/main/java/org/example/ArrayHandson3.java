package org.example;

import java.util.Arrays;

public class ArrayHandson3 {
    public static void sumArray(int arr[]){
        int sum =0;
        for(int i=0;i<arr.length;i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void binarySearch(){
        int a[] = {10,20,30,70,80};
        Arrays.sort(a);

        int key = 20;
        int index = Arrays.binarySearch(a,key);
        System.out.println(index);
        System.out.println(Arrays.toString(Arrays.copyOf(a,10)));
    }
    public static void main(String[] args) {
        int arr[] = {10,20};
        //sumArray(arr);
        binarySearch();
    }
}
