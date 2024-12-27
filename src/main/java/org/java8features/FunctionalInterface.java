package org.java8features;

interface Printable{
    public void message(String mess);

}
public class FunctionalInterface {
    public static void main(String[] args) {
        Printable p = mess -> {
            System.out.println(mess);
        };
        p.message("hello");
    }
}
