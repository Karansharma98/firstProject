package com.pragra.day8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
     WhileLoop.whileLoop();
        System.out.println();
        System.out.println(Math.random());
WhileLoop.guess2();



    }
    public static void whileLoop()
    {
        int i=1;
        while (i<=10)
        {
            System.out.print("Hello ");
             i++;
        }
    }
    public static void guess()
    {
        int thoughNo=(int)(Math.random()*10);
        System.out.println("Lets play");
        System.out.println("I have number in my mind .. you try guessing it");
        Scanner sc=new Scanner(System.in);
        while (true)
        {
            int guessNo = sc.nextInt();
            if(guessNo==thoughNo)
            {
                System.out.println("you guessed right ... :)");
                break;
            }
            else {
                System.out.println("Keep trying");
            }

        }

    }

    public static void guess1()
    {
        int thoughNo=(int)(Math.random()*10);
        System.out.println("Lets play");
        System.out.println("I have number in my mind .. you try guessing it");
        Scanner sc=new Scanner(System.in);
        int guessNo=sc.nextInt();
        while (guessNo!=thoughNo)
        {
            System.out.println("You were wrong ..keep trying");
             guessNo = sc.nextInt();

        }
        System.out.println("You win :)");

    }
    public static void guess2()
    {
        int thoughNo=(int)(Math.random()*100);
        System.out.println("Lets play");
        System.out.println("I have number in my mind .. you try guessing it");
        Scanner sc=new Scanner(System.in);
        int guessNo;


            do {
                    System.out.println("Keep Guessing :)");
                    guessNo = sc.nextInt();

                    if (guessNo > thoughNo) {

                        System.out.println("Your number is greater");
                    } else {

                        System.out.println("Your number is lesser");
                    }

                }

            while (thoughNo != guessNo) ;

    System.out.println("You win.. :)");

    }


}
