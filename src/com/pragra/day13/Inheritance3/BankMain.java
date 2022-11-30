package com.pragra.day13.Inheritance3;

public class BankMain {

    public static void main(String[] args) {

        Bank b1 = new BMOBank();
        System.out.println("Interst rate of BMO is "+b1.interst());

        b1=new ScotiaBank();
        System.out.println("Interst rate of Scotai is "+b1.interst());

        b1 =new TDBank();
        System.out.println("Interst rate of TD is "+b1.interst());




    }

}
