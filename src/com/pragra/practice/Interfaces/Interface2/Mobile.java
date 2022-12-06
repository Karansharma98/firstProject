package com.pragra.practice.Interfaces.Interface2;

public class Mobile implements Telephone{
    @Override
    public void setAlarms() {
        System.out.println("Alarm is on");
    }

    @Override
    public void makeCalculations() {
        System.out.println("You are doing calculations");
    }

    @Override
    public void ringNotifications() {
        System.out.println("Phone is ringing");
    }

    @Override
    public void playing() {
        System.out.println("playing");
    }

    @Override
    public void makeCalls() {
        System.out.println("You are calling");
    }
}
