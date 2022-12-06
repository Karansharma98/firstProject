package com.pragra.Assignment.Inheritance;

import java.util.Scanner;

public class Specification {
    public  void specification(int choice) {
        Car car = null;
        Scanner sc = new Scanner(System.in);

        switch (choice)
        {
            case 1:
                car = new Bmw();
                break;
            case 2:
                car = new Audi();
             break;
            case 3:
                car = new Honda();
                break;

        }

        System.out.println("Choose the Specifications");
        System.out.println("1.  Price");
        System.out.println("2.  Horse Power");
        System.out.println("3.  Engine Type");
        System.out.println("4   Exit");

        System.out.print("Enter your choice: ");
        int a = sc.nextInt();
        switch (a) {


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
    }
}
