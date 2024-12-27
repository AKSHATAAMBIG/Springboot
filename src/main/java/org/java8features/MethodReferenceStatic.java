package org.java8features;

import java.util.function.BiFunction;

class Hello{
    public static int add(int a, int b){
        return a + b;
    }
}

public class MethodReferenceStatic {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> biFunction = Hello::add;
        System.out.println(biFunction.apply(9,8));
    }
}
