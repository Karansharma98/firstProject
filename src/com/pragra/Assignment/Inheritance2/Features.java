package com.pragra.Assignment.Inheritance2;

public class Features extends Checking{
    int transactions;

    public Features(int accountNumber, float balance, int interstaRate, int transactions) {
        super(accountNumber, balance, interstaRate);
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return "Features{" +
                "transactions=" + transactions +
                ", interstaRate=" + interstaRate +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
