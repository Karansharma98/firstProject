package com.pragra.practice;
import java.util.Scanner;
public class cc {

    public static  void main(String[] args) {
        int thoughtNo = (int)(Math.random() * 100);
        System.out.println("***********Let's start the guessing Game**********");
        System.out.println("I have thought a number between 1 to 99. It's your turn now.");
        Scanner sc = new Scanner(System.in);
        int rep=0, guessedNo=0;
        do {
            System.out.println("Guess the number? -> ");
            guessedNo = sc.nextInt();
            if(rep>=10){
                break;
            }
            else if(thoughtNo==guessedNo) {
                System.out.println("You entered Correct Number... YOU WON!!!!");
            }
            else if (thoughtNo > guessedNo) {
                if ((thoughtNo - guessedNo) < 10) {
                    System.out.println("you are close to the number!! Enter a greater number.");
                } else if ((thoughtNo - guessedNo) > 10) {
                    System.out.println("you need to enter a greater number than the one you entered!!");
                }
            }
            else {
                if((guessedNo-thoughtNo) > 10){
                    System.out.println("you need to enter a smaller number than the one you entered!!");
                }
                else if ((guessedNo-thoughtNo) < 10) {
                    System.out.println("you are close to the number!! Enter a smaller number.");
                }
            }
            rep = rep+1;
        }
        while ((thoughtNo != guessedNo));

        if(thoughtNo != guessedNo){
            System.out.println("yo lost max tries done");



    }
        System.out.println("Spuuuuu");
        System.out.println("This is karan feature");
        System.out.println("This is pragragit  feature");
        System.out.println("Suiiiiii");


    }
}

