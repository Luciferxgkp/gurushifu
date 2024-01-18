package test.java.com.thoughtworks.wallet;

import main.java.com.thoughtworks.wallet.Wallet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.thoughtworks.wallet.exceptions.NegativeAmountException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.Matchers.is;

class WalletTest {

    @Test
    void shouldReturnBalance10WhenWeAdd10RupeesInTheWallet() throws NegativeAmountException {
        Wallet wallet = new Wallet();
        wallet.put(10);

        double balance = wallet.balance();

        assertThat(balance, is(closeTo(10, 0.01)));
    }

}
