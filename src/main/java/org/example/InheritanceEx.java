package org.example;

class Parent {
    public void childMethod(){
        System.out.println("parent method invoked");
    }
}

class Child extends Parent{
    public void childMethod(){
        System.out.println("child method invoked");
        super.childMethod();
    }
}
public class InheritanceEx {
    public static void main(String args[]){

        Child c = new Child();
        c.childMethod();
       // c.parentMethod();
    }
}
