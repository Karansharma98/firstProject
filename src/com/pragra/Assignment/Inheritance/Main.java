package com.pragra.Assignment.Inheritance;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        Car car = null;
        Specification s = new Specification();

        do {
            System.out.println("*****");
            System.out.println("1. BMW");
            System.out.println("2. AUDI");
            System.out.println("3. HONDA");
            System.out.println("4.  EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            Main m = new Main();

            switch (choice) {
                case 1:
                    System.out.println("You choosed BMW");
                    car = new Bmw();
                    s.specification(choice);


                    break;

                case 2:
                    System.out.println("You choosed Audi");
                    car = new Audi();
                    s.specification(choice);
                    break;

                case 3:
                    System.out.println("You choosed Honda");
                    car = new Honda();
                    s.specification(choice);
                    break;

                case 4:
                    System.out.println("You choosed to Exit ... , Have a good day ..:)");
                    break;

                default:
                    System.out.println("Invalid choice");
break;

            }

            System.out.println("Do you want to try again ? (y/n)");
            String z;
            z = sc.next();
            if (z.equals("y")) {
                continue;
            } else {
                break;
            }

        } while (choice != 0);
        System.out.println("You exit , Have a good day ..:)");
    }

}
