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
    public void canDepositFunds() {
        bank.deposit(10);
    }

    @Test
    public void canWithdrawFunds() {
        bank.deposit(20);
        bank.withdraw(10);
        assertThat(bank.balance(), is(10));
    }

    @Test
    public void canCheckBalance() {
        bank.deposit(10);
        assertThat(bank.balance(), is(10));
    }

}
