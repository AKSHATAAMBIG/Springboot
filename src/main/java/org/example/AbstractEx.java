package org.example;

abstract class A {
    abstract void method1();
}
    class B extends A{
        @Override
        void method1() {
            System.out.println("method1 is invoked");
        }
    }
public class AbstractEx{
    public static void main(String args[]){
        A a = new B();
        a.method1();
    }
}
