package com.pragra.day8;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        SwitchDemo.Month();
    }
    public static void Month() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter month number(1-12)");
        int monthNo = sc.nextInt();
        switch (monthNo)
            {
                case 1:

                case 7:

                case 8:

                case 5:
                case 3:

                case 10:

                case 12:
                    System.out.println("31 days");
                    break;
                case 2:
                    System.out.println("28 days");
                    break;

                case 4:

                case 6:

                case 9:

                case 11:
                    System.out.println("30 days");
                    break;

                default:
                    System.out.println("invalid input");

            }
    }
}
