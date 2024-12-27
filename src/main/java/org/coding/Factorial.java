package org.coding;

public class Factorial {
    public static void main(String[] args) {
        int fact = 1, n = 0;
        if(n == 0){
            System.out.println(fact);
        }
        else{
            for(int i = 1; i<=4;i++){
                fact *=i;
            }
            System.out.println(fact);
        }
    }
}
