package com.pragra.Assignment.Inheritance2;

public class Bank {

    int accountNumber;
    float balance;

    public Bank(int accountNumber, float balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
