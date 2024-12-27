package org.coding;

public class LargestOfThreeNo {
    public static void main(String[] args) {
        int a=40,b=20,c=30;
        if(a >= b && a>= c){
            System.out.println("a is the largest");
        }else if(b >= a && b >= c){
            System.out.println("b is the largest");
        }
        else{
            System.out.println("c is the largest");
        }
    }
}
