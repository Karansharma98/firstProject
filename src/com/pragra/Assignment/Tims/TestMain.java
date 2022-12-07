package com.pragra.Assignment.Tims;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.println("***** Tim Hortons Menu ******");
        System.out.println("1. Tim Merchandise");
        System.out.println("2. Tim Consumables");
        System.out.println("3. Exit ");
        System.out.println("Enter your choice : ");
        choice = sc.nextInt();
        TestMain main = new TestMain();
        switch (choice) {
            case 1:
                main.menu1();

                break;

            case 2:

                break;

            case 3:
                break;
        }
    }

    public void menu1() {
        System.out.println("*** Tim Mercandise ***");
        System.out.println("1. Mugs");
        System.out.println("2. Coffee Powder");
        System.out.println("3. Gift Cards");
        System.out.println("4. Hockey Cards");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                Mugs m = new Mugs();
                m.getPrice();
                m.toString1();
                m.getFeatures();
                break;

        }

    }

    public void secondLoop()
    {
        System.out.println("1. Order");
        System.out.println("2. Refresh");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
        }
    }
}


