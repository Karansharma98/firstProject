package com.pragra.day14.abstractPractice;

import com.sun.jdi.PathSearchingVirtualMachine;

import java.sql.SQLOutput;

public class TestMain {

    public static void main(String[] args) {
        WendingMachine machine;
        machine=new Coke();
        machine.number();
        machine.price();
        machine.quantity();

        System.out.println();
        machine=new Sprite();
        machine.number();
        machine.price();
        machine.quantity();

        System.out.println();
        machine=new Fanta();
        machine.number();
        machine.price();
        machine.quantity();

    }
    }

