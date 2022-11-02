package com.pragra.practice;

import java.sql.SQLOutput;

public class Loops {
    public static void main(String[] args) {
        Loops.loops1();
        System.out.println();
        Loops.loops2();
        System.out.println();
        Loops.loops3();
        System.out.println();
        Loops.loops4();
        System.out.println();
        Loops.loops5();
        System.out.println();
        Loops.loops6();
        System.out.println();
        Loops.loops7();
    }


    public static void loops1() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("Hello ");
            }
            System.out.println();
        }
    }

    public static void loops2() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void loops3() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void loops4() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void loops5() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void loops6() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == j) {

                    System.out.print("* ");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println();
        }
    }
    public static void loops7() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {

                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}

