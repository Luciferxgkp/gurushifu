package main.java.com.thoughtworks.wallet;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

public class Wallet {
    private double balance;

    public Wallet() {
        this.balance = 0;
    }

    public void put(double amount) throws NegativeAmountException {
        if (amount < 0)
            throw new NegativeAmountException();
        this.balance += amount;
    }

    public double balance() {
        return balance;
    }

}
