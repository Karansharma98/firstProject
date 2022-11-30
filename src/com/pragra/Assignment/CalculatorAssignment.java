package com.pragra.Assignment;

import java.util.Scanner;

public class CalculatorAssignment {

    public static void main(String[] args) {
        System.out.println("*********  Calculator ******");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3  Multiplication");
        System.out.println("4  Division");
        System.out.println("5  Modulus");
        System.out.println("0  Exit");
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your choice : ") ;
        choice = sc.nextInt();

        do {
            switch (choice) {
                case 0:

                    break;

                case 1:
                    add();
                    break;




                case 2:
                    subtraction();
                    break;


                case 3:

                    multiplication();

                    break;

                case 4:
                    division();
                    break;


                case 5:
                    modulus();


            }
            if(choice!=0) {
                System.out.println("Do you want to try again (y/n) ");
                String a;
                a=sc.next();
                if(a.equals("y"))
                {

                    System.out.println("*********  Calculator ******");
                    System.out.println("1. Addition");
                    System.out.println("2. Subtraction");
                    System.out.println("3  Multiplication");
                    System.out.println("4  Division");
                    System.out.println("5  Modulus");
                    System.out.println("0  Exit");
                    System.out.println("Do you want to try again !!! :)");
                    System.out.println("Choose the menu");
                    choice = sc.nextInt();
                }
                else
                {
                    break;
                }
            }
        }
        while (choice!=0);
        {
            System.out.println("You exit , Have a good day");
        }



    }
    public static void add()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Addition");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Add=a+b;
        System.out.println("Addition of the two numbers is "+Add);
    }

    public static void subtraction()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Subtarction");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int Sub=a-b;
        System.out.println("Subtraction of the two numbers is "+Sub);
    }

    public static void multiplication()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Multiplication");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int multiply=a*b;
        System.out.println("Multiplication of the two numbers is "+multiply);
    }

    public static void division()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Dvision");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        while(a==0 || b==0) {
            System.out.println("You cant choose zero");
            System.out.println("Enter again");
            System.out.println("Give your two number : ");
            a=sc.nextInt();
            b=sc.nextInt();


        }
        int division=a/b;
        System.out.println("Divion of the two numbers is "+division);
    }







    public static void modulus()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Modulus");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int modulus=a%b;
        System.out.println("Multiplication of the two numbers is "+modulus);
    }

    public static void initialize()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("You choosed Modulus");
        System.out.println("Give your two number : ");
        int a=sc.nextInt();
        int b=sc.nextInt();
    }
}
