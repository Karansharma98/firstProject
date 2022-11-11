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

        Calculator.Factorial();

        Calculator.Fibonacci();

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

    public static void Factorial() {
        int a=10;
        for(int i=9;i>0;i--)
        {
            a=a*i;
        }
        System.out.println("Factorial of 10 is "+a);
    }

    public static void Fibonacci(){
        int first=0 , second=1 , third;
        System.out.print("Fibonacci series of 10 is ");
        for (int i = 0; i < 10; i++) {
            System.out.print(first+" ");
            third=first+second;
            first=second;
            second=third;
        }
        System.out.println("Vivek changes");
        System.out.println("karan changes");
    }

}
