package com.pragra.day13.Inheritance2;

import java.sql.SQLOutput;

public class TestMain {

    public static void main(String[] args) {

        // BMO Bank

        Location2 l2 = new Location2();



        System.out.println("Methods for bmo bank base classes");

        l2.Location2();
        l2.InterstRate2();
        l2.Deposit();

        l2.Withdraw();

        System.out.println();
        System.out.println();
        // Scotiabank

        Location3 l3 = new Location3();

        System.out.println("Methods for Scotia bank base classes");

     l3.Location3();
     l3.InterstRate3();
     l3.Deposit();
     l3.Withdraw();

        System.out.println();
        System.out.println();

        // TD Bank

        Location4 l4 = new Location4();

        System.out.println("Methods for Scotia bank base classes");

        l4.Location4();
        l4.InterstRate4();
        l4.Deposit();
        l4.Withdraw();


    }

}
