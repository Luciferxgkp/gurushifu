package test.java.com.thoughtworks.wallet;

import main.java.com.thoughtworks.wallet.Wallet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.is;

class WalletTest {
    @Test
    void shouldReturnBalance0WhenWeInitializeTheWallet() throws IllegalArgumentException {
        Wallet wallet = new Wallet();

        double balance = wallet.balance();

        assertThat(balance, is(closeTo(0, 0)));
    }

    @Test
    void shouldReturnBalance10WhenWeAdd10RupeesInTheWallet() throws IllegalArgumentException {
        Wallet wallet = new Wallet();
        wallet.put(10);

        double balance = wallet.balance();

        assertThat(balance, is(closeTo(10, 0)));
    }

    @Test
    void shouldReturnBalance100WhenWeAdd50RupeesTwoTimesInTheWallet() throws IllegalArgumentException {
        Wallet wallet = new Wallet();
        wallet.put(50);
        wallet.put(50);

        double balance = wallet.balance();

        assertThat(balance, is(closeTo(100, 0)));
    }

    @Test
    void shouldThrowExceptionWhenWeAddNegativeAmountInTheWallet() throws IllegalArgumentException {
        Wallet wallet = new Wallet();

        assertThrows(IllegalArgumentException.class, () -> wallet.put(-50));
    }
}
