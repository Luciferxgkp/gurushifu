package main.java.com.thoughtworks.wallet;

import com.thoughtworks.wallet.Rupee;

public class Wallet {
    private Rupee balance;

    public Wallet() throws Exception {
        this.balance = new Rupee(0);
    }

    public void put(Rupee amount) throws Exception {
        this.balance = Rupee.add(amount, balance);
    }

    public Rupee balance() {
        return balance;
    }

}
