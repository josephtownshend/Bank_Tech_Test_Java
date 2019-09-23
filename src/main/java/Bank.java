import java.util.ArrayList;


public class Bank {

    private int balance = 0;

    ArrayList<Integer> transactionHistory = new ArrayList<Integer>(0);

    public int balance() {
        return balance;
    }

    public void deposit(int fundsDeposited) {
        balance += fundsDeposited;
        transactionHistory.add(fundsDeposited);
        transactionHistory.add(balance);

        System.out.println(transactionHistory);
    }

    public void withdraw(int fundsWithdrawn) {
        balance -= fundsWithdrawn;
    }


}
