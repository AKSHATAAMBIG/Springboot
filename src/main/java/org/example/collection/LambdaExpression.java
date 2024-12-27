package org.example.collection;

interface A{
    public int draw(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        A a = (x, y) -> x + y;
        System.out.println(a.draw(10,20));
//        A d = name -> {
//            return "Akshata"+name;
//        };
//        System.out.println(d.draw("hhhh"));
    }

}
