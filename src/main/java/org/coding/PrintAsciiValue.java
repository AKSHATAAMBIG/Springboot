package org.coding;

public class PrintAsciiValue {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.println((int)ch);
        for(int i = 0; i<=255;i++){
            System.out.println((char)i);
        }
    }
}
