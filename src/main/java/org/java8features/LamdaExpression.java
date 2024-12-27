package org.java8features;

public class LamdaExpression {

    public static void main(String[] args) {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("running method");
//            }
//        };
//        r.run();

        Runnable r = ()-> {
            System.out.println("running method");
        };
    }
}
