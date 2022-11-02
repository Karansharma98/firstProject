package com.pragra.day7;

public class Loops {


        public static void main(String[] args) {


            com.pragra.day7.Loops.loops1();
            com.pragra.day7.Loops.question1();

        }
        public static void loops1()
        {
            for (int i = 1; i <=5 ; i++) {

                for (int j = 1; j <= 5; j++) {
                    if(i==j)
                    {
                        System.out.print("* ");
                    }
                    else {
                        System.out.print(" ");
                    }
                }


                System.out.println();
            }


        }
        public static void question1()
        {
            for (int i = 1; i <= 5; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }
    }



