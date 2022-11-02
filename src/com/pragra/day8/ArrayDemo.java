package com.pragra.day8;

public class ArrayDemo {
    public static void main(String[] args) {

      ArrayDemo.Array1();
    }
    public static void Array1()
    {
        int[] marksOfAllStudents=new int[10];
        marksOfAllStudents[0]=10;
        marksOfAllStudents[1]=20;
        marksOfAllStudents[2]=30;
        marksOfAllStudents[3]=40;
        marksOfAllStudents[4]=50;
        marksOfAllStudents[5]=60;
        marksOfAllStudents[6]=70;
        marksOfAllStudents[7]=80;
        marksOfAllStudents[8]=90;
        marksOfAllStudents[9]=100;


        for (int i = 0; i <10 ; i++) {
            System.out.println(marksOfAllStudents[i]);
        }
    }
}

