package main.java.com.thoughtworks.wallet;

public class Wallet {
    private double balance;

    public Wallet() {
        this.balance = 0;
    }

    public void put(double amount) throws IllegalArgumentException {
        if (ValidateWallet.isValidAmount(amount))
            this.balance += amount;
    }

    public double balance() {
        return balance;
    }

}
