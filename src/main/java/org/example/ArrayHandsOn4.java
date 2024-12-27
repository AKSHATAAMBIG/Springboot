package org.example;

public class ArrayHandsOn4 {
    public static void main(String[] args) {
        int arr[] = {1,2, 3};
        int cloneArray[] = arr.clone();

        System.out.println(arr == cloneArray);
        for(int i = 0; i<cloneArray.length;i++){
            System.out.println(cloneArray[i]);
        }
    }
}
