package org.coding;

public class Armstrong {
    public static void main(String[] args) {
        int n = 153,temp,sum=0, rem=0;
        temp = n;
        while(n > 0){
            rem = n % 10;
            sum = sum + rem * rem * rem;
            n = n / 10;
        }
        if(temp == sum){
            System.out.println("Armstrong number");
        }else{
            System.out.println("not armstrong number");
        }
    }
}
