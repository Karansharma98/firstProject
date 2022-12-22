package com.pragra.day15.collections.exceptionHandling;

import java.util.Scanner;

public class practice {
    public static void main(String[] args)  {

//try {
//    System.out.println("Before exception");
//
//    int a = 5;
//    int b = 0;
//    int div = a / b;
//    System.out.println(div);
//
//    int s=Integer.parseInt("karan");
//}
//
//catch (Exception e)
//{
//    e.printStackTrace();
//}
//
//finally {
//    System.out.println("finally block");
//}
//
//        System.out.println("\n After exception");

//
//        try{
//
//            System.out.println("Enter age : ");
//            Scanner sc=new Scanner(System.in);
//            int age=sc.nextInt();
//            if(age <18)
//            throw new Exception("Age cant be less than 18");
//
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
////        }
//        try {
//            example();
//        }
//        catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }

        Scanner sc=new Scanner(System.in);
        String a = sc.next();

        try {
            if (a.length()<10)
            {
                throw new NumberLengthException("Number has to be 10");
            }

        }

        catch (NumberLengthException e)
        {
            System.out.println(e.getMessage());
        }

    }

//        public static void example() throws Exception{
//
//            System.out.println("Enter age : ");
//            Scanner sc=new Scanner(System.in);
//            int age=sc.nextInt();
//            if(age <18)
//                throw new Exception("Age cant be less than 18 coming from method");
//
//        }


    }




