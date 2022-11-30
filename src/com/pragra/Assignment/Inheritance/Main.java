package com.pragra.Assignment.Inheritance;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("*****");
            System.out.println("1. BMW");
            System.out.println("2. AUDI");
            System.out.println("3. HONDA");
            System.out.println("4.  EXIT");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            Car car;
            Main m = new Main();

            switch (choice) {
                case 1:
                    System.out.println("You choosed BMW");
                    car = new Bmw();
                    switch (m.specification()) {
                        case 1:
                            System.out.println("You choosed Price");
                            System.out.println("The car price is " + car.price());

                            break;

                        case 2:
                            System.out.println("You choosed Horse Power");
                            System.out.println("The horse power is " + car.horsePower());
                            break;

                        case 3:
                            System.out.println("You choosed Engine Type");
                            System.out.println("The Engine type is " + car.engineType());
                            break;
                    }

                    break;

                case 2:
                    System.out.println("You choosed Audi");
                    car = new Audi();
                    switch (m.specification()) {
                        case 1:
                            System.out.println("You choosed Price");
                            System.out.println("The car price is " + car.price());

                            break;

                        case 2:
                            System.out.println("You choosed Horse Power");
                            System.out.println("The horse power is " + car.horsePower());
                            break;

                        case 3:
                            System.out.println("You choosed Engine Type");
                            System.out.println("The Engine type is " + car.engineType());
                            break;
                    }

                    break;

                case 3:
                    System.out.println("You choosed Honda");
                    car = new Honda();
                    switch (m.specification()) {
                        case 1:
                            System.out.println("You choosed Price");
                            System.out.println("The car price is " + car.price());

                            break;

                        case 2:
                            System.out.println("You choosed Horse Power");
                            System.out.println("The horse power is " + car.horsePower());
                            break;

                        case 3:
                            System.out.println("You choosed Engine Type");
                            System.out.println("The Engine type is " + car.engineType());
                            break;
                    }
                    break;

                case 4:
                    System.out.println("You choosed to Exit ... , Have a good day ..:)");
                    break;

                default:
                    System.out.println("Invalid choice");



            }

            System.out.println("Do you want to try again ? (y/n)");
            String s;
            s = sc.next();
            if (s.equals("y"))
            {
                continue;
            }
            else
            {
                break;
            }

        } while (choice != 0);
        System.out.println("You exit , Have a good day ..:)");
    }

    public int specification()
    {

        System.out.println("***");
        System.out.println("Choose the Specifications");
        System.out.println("1.  Price");
        System.out.println("2.  Horse Power");
        System.out.println("3.  Engine Type");
        System.out.println("4   Exit");

        System.out.print("Enter your choice: ");
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        return a;
    }
}
