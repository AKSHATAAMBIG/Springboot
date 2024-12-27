package org.example;

class Employee {
    int rollNo;
    String name;

    public Employee(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                '}';
    }
}

public class ArrayHandsOn2 {
    public static void main(String[] args) {
//        Employee s[] = new Employee[2];
//        s[0] =  new Employee(1,"akshu");
//        s[1] =  new Employee(2,"jjhaja");

        Employee s[] = new Employee[]{new Employee(1,"akshu"),new Employee(2,"jjhaja")};

        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }

        

    }
}
