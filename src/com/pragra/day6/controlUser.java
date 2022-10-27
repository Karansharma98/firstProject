package com.pragra.day6;

import java.util.Scanner;

public class controlUser {
    public static void main(String[] args) {
        int x;
        System.out.println("enter the number");
        Scanner sc= new Scanner(System.in);
        int i = sc.nextInt();
        sc.next();

        System.out.println(i);

        testOdd(10);
        checkPositive(0);
        testMonthDays(6);
        greatestOf3(2,2,1);
        checkEligible(true);
int q=0;
        for(int a=1;a<5;a++)
        {
            q=q+a;

        }
        System.out.println(q);

        int sum=10;
        for(int j=9;j>1;j--)
        {

            sum=sum*j;

      }
        System.out.println(sum);
        int add=0;
        for(int a=1;a<=10;a++)
        {
            add=add+a;
        }
        System.out.println(add);

        int fib=0;
      for(int w=0;w<10;w++)
        {
            fib=fib+w ;
            System.out.println(fib);
        }

    }



    public static void testOdd(int x) {
        if (x % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void checkPositive(int x) {
        if (x > 0) {
            System.out.println("positive");

        } else if (x == 0) {
            System.out.println("neutral");
        } else {
            System.out.println("negative");
        }
    }

    public static void testMonthDays(int x) {
        if (x == 1) {
            System.out.println("31");
        } else if (x == 2) {
            System.out.println("28");
        } else if (x == 3) {
            System.out.println("31");
        } else if (x == 4) {
            System.out.println("30");
        } else if (x == 5) {
            System.out.println("31");
        } else if (x == 6) {
            System.out.println("30");
        } else if (x == 7) {
            System.out.println("31");
        } else if (x == 8) {
            System.out.println("31");
        } else if (x == 9) {
            System.out.println("30");
        } else if (x == 10) {
            System.out.println("30");
        } else if (x == 11) {
            System.out.println("31");
        } else {
            System.out.println("31");
        }
    }

    public static void greatestOf3(int a, int b , int c)
    {
        if(a>=b&&a>=c)
        {
            System.out.println("a wins");

        }
        else if (b>=a && b>=c)
        {
            System.out.println("b wins" );
        }
        else
            System.out.println("c wins");
    }

    public static void checkEligible(boolean isActive)
    {
        if (isActive)
        {
            System.out.println("eligible");
        }
        else {
            System.out.println("not Eligible");
        }
    }



}




