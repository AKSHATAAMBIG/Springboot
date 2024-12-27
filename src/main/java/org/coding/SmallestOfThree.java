package org.coding;

public class SmallestOfThree {
    public static void main(String[] args) {
        int a=40,b=20,c=30;
        if(a <= b && a <= c){
            System.out.println("a is the smallest");
        }else if(b <= a && b <= c){
            System.out.println("b is the smallest");
        }
        else{
            System.out.println("c is the smallest");
        }
    }
}
