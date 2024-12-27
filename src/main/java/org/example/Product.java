package org.example;

import java.util.*;
class A1{
    int id;
    String name;
    float price;
    public A1(int id, String name, float price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
public class Product {
    public static void main(String[] args) {
        List<A1> productsList = new ArrayList<A1>();
        //Adding Products
        productsList.add(new A1(1,"HP Laptop",25000f));
        productsList.add(new A1(2,"Dell Laptop",30000f));
        productsList.add(new A1(3,"Lenevo Laptop",28000f));
        productsList.add(new A1(4,"Sony Laptop",28000f));
        productsList.add(new A1(5,"Apple Laptop",90000f));
        // This is more compact approach for filtering data
        productsList.stream()
                .filter(products->products.price == 25000f)
                .forEach(products-> System.out.println(products.name));
    }
}