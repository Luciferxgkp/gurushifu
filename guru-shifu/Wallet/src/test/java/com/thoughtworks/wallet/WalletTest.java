package test.java.com.thoughtworks.wallet;

import com.thoughtworks.wallet.Rupee;
import main.java.com.thoughtworks.wallet.Wallet;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.hamcrest.Matchers.is;

class WalletTest {
    @Test
    void shouldReturnBalance0WhenWeInitializeTheWallet() throws Exception {

        Wallet wallet = new Wallet();

        Rupee balance = wallet.balance();

        assertTrue(balance.equals(new Rupee(0)));
    }

    @Test
    void shouldReturnBalance10WhenWeAdd10RupeesInTheWallet() throws Exception {
        Wallet wallet = new Wallet();
        wallet.put(new Rupee(10));

        Rupee balance = wallet.balance();

        boolean isEqual = balance.equals(new Rupee(10));

        assertTrue(isEqual);
    }

    @Test
    void shouldReturnBalance100WhenWeAdd50RupeesTwoTimesInTheWallet() throws Exception {
        Wallet wallet = new Wallet();

        wallet.put(new Rupee(50));
        wallet.put(new Rupee(50));

        Rupee balance = wallet.balance();

        boolean isEqual = balance.equals(new Rupee(100));

        assertTrue(isEqual);
    }

    @Test
    void shouldThrowExceptionWhenWeAddNegativeAmountInTheWallet() throws Exception {
        Wallet wallet = new Wallet();

        assertThrows(Exception.class, () -> wallet.put(new Rupee(-10)));
    }
}
