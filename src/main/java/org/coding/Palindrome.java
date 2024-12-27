package org.coding;

public class Palindrome {
    public static void main(String[] args) {
        int n = 368, temp,sum=0;
        temp = n;
        while(n > 0){
            int rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if( temp == sum){
            System.out.println("palindrome:"+ sum);
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
