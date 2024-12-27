package org.coding;

// 0 1 1 2 3 5 8 13
public class Fibonacci {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1, n3, n= 5;
        System.out.println(n1+ " "+n2);
        for(int i = 2; i <= n;i++){
            n3 = n1 + n2;//1 2 3 5
            System.out.print(" "+n3);//1 2 3 5
            n1 = n2;//1 1 2 3
            n2 = n3;//1 2 3 5
        }
    }
}
