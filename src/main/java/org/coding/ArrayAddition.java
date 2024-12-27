package org.coding;

public class ArrayAddition {
    public static void main(String[] args) {
        int[][] a = {{1,2,4},{5,6,7}};
        int[][] b = {{1,2,4},{5,6,7}};

        int[][] c = new int[2][3];

        for(int i = 0;i<2;i++) {//row
            for (int j = 0; j <3; j++) {//columns
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
