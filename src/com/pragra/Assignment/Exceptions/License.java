package com.pragra.Assignment.Exceptions;

import java.util.Scanner;

public class License {


        static String ans;
        public static void main(String[] args){
            do {
                int age;
                System.out.println("** Driving Age Information **");
                System.out.println("Enter your age : ");
                Scanner sc = new Scanner(System.in);
                age = sc.nextInt();


                try {

                    if (age < 16) {
                        throw new Exception("You are not eligible to drive");
                    } else if (age >= 16 && age < 18) {
                        throw new Exception("You are only eligible to drive with G1 license with the supervision of the guardian with license history over 5 years");

                    } else if (age >= 18 && age < 21) {
                        throw new Exception("You are not eligible to drive but not on the highways in the night time");

                    } else {
                        throw new Exception("You are fully eligible to drive anywhere with full G License");

                    }
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("Do you want to repeat (y/n): ");
                ans = sc.next();

            }
            while (ans.equals("y"));
            System.out.println("You exit , have a good day.. :)");


        }
}

