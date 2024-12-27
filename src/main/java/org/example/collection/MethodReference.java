package org.example.collection;

interface B{
    public void say();
}
public class MethodReference {

    public static void saying(){
        System.out.println("this is static method");
    }

    public static void main(String[] args) {
        B b = MethodReference::saying;
        b.say();
    }
}
