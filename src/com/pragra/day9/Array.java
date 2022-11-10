package com.pragra.day9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        //Array.array2();
        //Array.array1();
        //Array.marks();
        Array.marks2();
    }

    public static void array1() {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("enter marks");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i]);

        }
        System.out.println(Arrays.toString(arr));
    }

    public static void array2() {
        String[] arr = new String[3];
        arr[0] = "Karan";
        arr[1] = " ";
        arr[2] = "Sharma";
        for (int i = 0; i < 3; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();

        String[] arr1 = {"Karan", " ", "Sharma"};

        int[] marks = {1, 2, 3, 4, 5};

        int[] marks1 = new int[]{1, 2, 3, 4, 5};
        Random r = new Random();
        int marks2[] = new int[5];
        for (int i = 0; i < 5; i++) {
            marks2[i] = r.nextInt(100);
            System.out.println(marks2[i]);

        }
    }

    public static void marks() {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];

        }
        System.out.println(total);
        System.out.println(total / marks.length);
    }

    public static void marks1() {
        int marks[] = new int[5];
        Scanner sc = new Scanner(System.in);
        int total = 0;
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
            total = total + marks[i];

        }
        System.out.println(total);
        System.out.println(total / marks.length);
    }

    public static void marks2() {

        int marks[] = {10, 34, 75, 30, 82};
        int assumed = marks[0];
        for (int i = 0; i < 5; i++) {
            if (marks[i] > assumed) {
                assumed = marks[i];

            }}
            System.out.println("Highest  number is " + assumed);


        }

        public static void twoDimensionalArray()
        {
            int[][] arr=new int[3][4];
            arr[0][0]=10;      arr[0][1]=10;      arr[0][2]=10;  arr[0][3]=10;
            arr[1][0]=10;      arr[1][1]=10;      arr[1][2]=10;  arr[1][3]=10;
            arr[2][0]=10;      arr[2][1]=10;      arr[2][2]=10;  arr[2][3]=10;
            System.out.println("hello");
            System.out.println("karan changes");
            System.out.println("PUSHPINDER CHANGES");           
            System.out.println("KARAN CHANGES");

        }
    }



