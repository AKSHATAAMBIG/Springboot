package org.coding;

public class ArrayFrequency {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 10, 20, 30};
        int visited[] = new int[arr1.length]; // Array to mark processed elements
        int visitedFlag = -1; // Flag for visited elements

        for (int i = 0; i < arr1.length; i++) {
            if (visited[i] == visitedFlag) {
                continue; // Skip already processed elements
            }

            int count = 1; // Count the current element itself
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] == arr1[j]) {
                    count++;
                    visited[j] = visitedFlag; // Mark as processed
                }
            }
            System.out.println("Element " + arr1[i] + " occurs " + count + " times.");
        }
    }
}
