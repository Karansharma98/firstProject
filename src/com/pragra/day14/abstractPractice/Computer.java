package com.pragra.day14.abstractPractice;

public class Computer extends Console{
    @Override
    void Calculate() {
        System.out.println("Calculating");
    }

    @Override
    void play() {
        System.out.println("Playing");
    }
}
