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
        bank.credit(15);
        assertThat(bank.balance(), is(15));
    }

    @Test
    public void canDepositFunds() {
        bank.credit(10);
    }

    @Test
    public void canWithdrawFunds() {
        bank.debit(10);
        assertThat(bank.balance(), is(-10));
    }

}
