package com.pragra.day8;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
     //WhileLoop.whileLoop();
        System.out.println();
        System.out.println(Math.random());
        //WhileLoop.guess1();
         //WhileLoop.guess2();
         //WhileLoop.guess3();
       // WhileLoop.guess5();
        //WhileLoop.guess6();
        WhileLoop.guess7();



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
    public static void guess2() {
        int thoughNo = (int) (Math.random() * 100);
        System.out.println("Lets play");
        System.out.println("I have number in my mind .. you try guessing it");
        Scanner sc = new Scanner(System.in);

                int repNo = 0,guessNo=0;

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

    public static void guess3() {
        int thoughNo = (int) (Math.random() * 100);
        System.out.println("Lets play");
        System.out.println("I have number in my mind .. you try guessing it");

        int repNo = 1,guessNo;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Guess the number? -> ");
            guessNo = sc.nextInt();
            if(repNo>=10){
                break;
            } else if (guessNo==thoughNo) {

                System.out.println("you win");

            } else if (guessNo > thoughNo) {

                System.out.println("Your number is greater");
            } else {

                System.out.println("Your number is lesser");
            }



            repNo = repNo + 1;}
        while (thoughNo != guessNo) ;

        System.out.println("You lost , maximum tries done.. :)");




    }
    public static void guess5()
    {
        int a=(int)(Math.random()*100);

        Scanner sc=new Scanner(System.in);
        System.out.println("lets play");
       int b=sc.nextInt();
        System.out.println("keep guessing");

        while(a!=b){

            b=sc.nextInt();
            System.out.println("keep guessing");
        }
        System.out.println("you win");
    }

    public static void guess6()
    {
        int a,b;
        a=(int)(Math.random()*100);
        System.out.println("keep guessing");
        do
        {
            Scanner sc=new Scanner(System.in);
             b=sc.nextInt();
            if (b>a) {
                System.out.println("Your no is greater , Keep guessing");
            }
            else {
                System.out.println("Your no is lesser , Keep guessing");

            }
        }while(a!=b);
        System.out.println("you win");
    }
    public static void guess7()
    {
        int a,b,c=1;
        a=(int) (Math.random()*100);
        System.out.println("keep guessing");

        do
        {
            Scanner sc=new Scanner(System.in);
            b=sc.nextInt();

            if(c>=10)
            {
                break;
            }
            else if(a==b)
            {
                System.out.println("you win");
            } else if (b>a) {
                System.out.println("guess is greater");
            }
            else {
                System.out.println("guess is lesser");
            }
            c+=1;
        }while(a!=b);
        System.out.println("you lost , max tries done");

    }
}
