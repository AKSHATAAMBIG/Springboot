package org.coding;

public class StringPalindrome {
    public static void main(String[] args) {
        String p ="nayan";
        boolean flag = true;

        p = p.toLowerCase();
        for(int i =0;i<p.length()/2;i++){
            if(p.charAt(i)!=p.charAt(p.length()-i-1)){
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("String is palndrome");
        }else{
            System.out.println("not palindrome");
        }
    }
}
