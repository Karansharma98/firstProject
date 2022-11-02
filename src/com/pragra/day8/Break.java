package com.pragra.day8;

public class Break {
    public static void main(String[] args) {
       Break.break1();
        System.out.println();
        System.out.println();
        Break.continue1();
    }

    public static void break1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("start " + i);
            {
                if (i == 5) {
                    break;
                }
                    System.out.println("end "+i);

            }
        }
    }

    public static void continue1() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("start " + i);
            {
                if (i == 5) {
                    continue;
                }
                    System.out.println("end " + i);

            }
        }
    }
}
