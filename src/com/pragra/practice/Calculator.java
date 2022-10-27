package com.pragra.practice;


public class Calculator {

    public static void main(String[] args) {
        int sum = sum(10,20);
        System.out.println(sum);

        int diff = diff(10, 5);
        System.out.println(diff);

        int multiply = multiply(5, 2);
        System.out.println(multiply);

        int divide = divide(10, 2);
        System.out.println(divide);

    }

    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int diff(int a,int b)
    {
        return a-b;
    }

    public static int multiply(int a,int b)
    {
        return a*b;
    }

    public static int divide(int a,int b)
    {
        return a/b;
    }

}
