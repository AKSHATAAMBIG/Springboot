package org.coding;

public class DuplicateElementsArray {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 10, 40, 30};
        for(int i = 0; i < arr1.length ; i++){
            for (int j = i+1 ; j < arr1.length; j++){
                if(arr1[i] ==  arr1[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
