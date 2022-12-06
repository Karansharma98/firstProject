package com.pragra.practice;

import java.util.Scanner;

public class Conains {

        public static void main(String args[])
        {

            // Custom input string
            String str = "GeeksForGeeks";

            // Creating array of string length
            // using length() method
            char[] ch = new char[str.length()];

            // Copying character by character into array
            // using for each loop
            for (int i = 0; i < str.length(); i++) {
                ch[i] = str.charAt(i);
            }

            for (int i = 0; i < str.length(); i++) {
                System.out.print(ch[i] + " ");
            } }}

