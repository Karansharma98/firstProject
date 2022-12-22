package com.pragra.Assignment.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestMain {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<Employee>();

        Employee e1=new Employee("karan","sharma",100000.0,"93577368");
        Employee e2=new Employee("shivam","luthra",200000.0,"93577368");
        Employee e3=new Employee("rohan","aggarwal",300000.0,"93577368");
        Employee e4=new Employee("nikhil","salaria",400000.0,"93577368");
        Employee e5=new Employee("saksham","sharma",500000.0,"93577368");
        Employee e6=new Employee("ryan","sharma",500000.0,"93577368");
        Employee e7=new Employee("aditi","sharma",500000.0,"93577368");


        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);
        list.add(e6);
        list.add(e7);
        System.out.println(list);
        System.out.println();


        // Add the employee at 5th index

        Employee e8=new Employee("jeeshant","sharma",500000.0,"93577368");

        list.add(5,e8);
        for (Employee element: list
             ) {
            System.out.println(element);

        }
        System.out.println();
        System.out.println();
        // Delete employee at 7th index

        list.remove(7);

        for (Employee element: list
        ) {
            System.out.println(element);

        }



// Add employee of different collection






    }
}
