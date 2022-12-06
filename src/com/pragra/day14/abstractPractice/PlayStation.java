package com.pragra.day14.abstractPractice;

public class PlayStation extends Console {

    @Override
    void Calculate() {
        System.out.println("Calculating 2");
    }

    @Override
    void play() {
        System.out.println("Playing 2");
    }
}
