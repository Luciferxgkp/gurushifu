package main.java.com.thoughtworks.wallet;

public class ValidateWallet {
    public static boolean isValidAmount(double amount) throws IllegalArgumentException {
        if (amount < 0)
            throw new IllegalArgumentException();
        return true;
    }
}
