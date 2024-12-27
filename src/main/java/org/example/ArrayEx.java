package org.example;

public class ArrayEx {
    static int[] get(){
        return new int[]{10,2,4};
    }
    public static void main(String args[]){
        int arr[] = get();
                for(int i=0;i< arr.length;i++){
                    System.out.println(arr[i]);
                }
    }
}
