package com.pragra.day3;

public class demo {
    public static void main(String[] args) {


        demo.sum();
        demo.factorial();
        demo.fibonacci();

    }

    public static void sum() {
        int a = 0;
        for (int i = 0; i < 10; i++) {
            a = a + i;
        }
        System.out.println("Sum of first 10 digits :" + a);
    }

    public static void factorial()
    {
        int i=10;
        for (int j = 9; j > 0; j--) {
            i=i*j;

        }
        System.out.println("Factorial of 10 is :"+i);
    }

    public static void fibonacci()
    {
        int first=0,second=1;
        System.out.print("Fibonacci series of 10 is ");
        for (int i = 0; i <10 ; i++) {

            int third=first+second;
            System.out.print(first+" ");
            first=second;
            second=third;

        }
    }
}
