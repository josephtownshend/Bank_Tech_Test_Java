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

}
