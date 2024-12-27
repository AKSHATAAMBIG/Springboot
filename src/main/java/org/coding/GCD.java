package org.coding;

public class GCD {
    public static void main(String[] args) {
        int n1 = 10, n2 = 20;
        while(n1 != n2){
            if(n1 > n2){
                n1= n1 - n2;
            }else{
                n2 = n2 - n1;
            }
        }
        System.out.println(n2);
    }
}
