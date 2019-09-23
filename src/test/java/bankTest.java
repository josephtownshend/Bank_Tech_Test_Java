import org.junit.Test;
import org.junit.Before;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class bankTest {

    private Bank bank;

    @Before
    public void setUp() {
        bank = new Bank();
    }

    @Test
    public void canMakeBank() {
        new Bank();
    }

    @Test
    public void balanceShouldStartAtZero() {
        assertThat(bank.balance(), is (0));
    }

    @Test
    public void canCheckBalance() {
        bank.deposit(15);
        assertThat(bank.balance(), is(15));
    }

    @Test
    public void canDepositFunds() {
        bank.deposit(10);
    }

    @Test
    public void canWithdrawFunds() {
        bank.withdraw(10);
        assertThat(bank.balance(), is(-10));
    }

}
