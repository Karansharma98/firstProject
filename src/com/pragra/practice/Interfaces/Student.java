package com.pragra.practice.Interfaces;

public class Student implements Human ,Person{
    public static void main(String[] args) {

        Student s=new Student();
        s.sleep();
        s.think();
        s.walk();
    }

    @Override
    public void sleep() {
        System.out.println("sleeping");
    }

    @Override
    public void walk() {
        System.out.println("waling");
    }

    @Override
    public void think() {
        System.out.println("thinking");
    }
}
