package com.pragra.Assignment.Inheritance2;

public class CreditScore extends Visa{
    int score1;

    public CreditScore(int accountNumber, float balance, float limt, int score) {
        super(accountNumber, balance, limt);
        this.score1 = score;
    }


    @Override
    public String toString() {
        return "CreditScore{" +
                "score=" + score1 +
                ", limt=" + limt +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
