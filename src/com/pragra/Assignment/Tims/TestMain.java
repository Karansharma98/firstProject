package com.pragra.Assignment.Tims;

import java.util.Scanner;

public class TestMain {

    public static void main(String[] args) {
        int choice;
        int total;
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
        System.out.println("Do you want to order again ?(y/n)..");
        String ans =sc.next();
        if(ans.equals("y"))
        {
            System.out.println("***** Tim Hortons Menu ******");
            System.out.println("1. Tim Merchandise");
            System.out.println("2. Tim Consumables");
            System.out.println("3. Exit ");
            System.out.println("Enter your choice : ");
            choice = sc.nextInt();
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


    }


    public int menu1() {
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
                System.out.println(m.getPrice());
                m.getFeatures();
                m.toString1();

        }


        return choice;
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


