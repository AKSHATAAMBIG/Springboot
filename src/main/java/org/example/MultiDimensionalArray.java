package org.example;

public class MultiDimensionalArray {
    public static void main(String args[]){

        int arr[][] = {{1,2,3},{3,9,8},{9,9,0}};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
