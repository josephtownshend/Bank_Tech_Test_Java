import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class bankTest {

    @Test
    public void canMakeBank() {
        new Bank();
    }

    @Test
    public void canDepositFunds() {
        Bank bank = new Bank();
        bank.deposit(0);
    }

    @Test
    public void canCheckBalance() {
        Bank bank = new Bank();
        bank.deposit(10);
        assertThat(bank.balance(), is(10));
    }

}
