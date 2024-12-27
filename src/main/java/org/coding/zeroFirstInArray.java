package org.coding;

public class zeroFirstInArray {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 0, 0, 9, 8};
        int arr2[] = new int[arr1.length]; // Result array

        int index = 0; // Pointer for inserting zeros
        // First, insert zeros into arr2
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr2[index++] = arr1[i];
            }
        }

        // Then, insert non-zero elements
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != 0) {
                arr2[index++] = arr1[i];
            }
        }

        // Print the result
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
}

