package com.pragra.Assignment.Inheritance2;

public class Visa extends Bank{
    float limt;

    public Visa(int accountNumber, float balance, float limt) {
        super(accountNumber, balance);
        this.limt = limt;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "limt=" + limt +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
