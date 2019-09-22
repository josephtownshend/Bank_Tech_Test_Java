public class Bank {

    private int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int fundsDeposited) {
        balance += fundsDeposited;
    }

    public void withdraw(int fundsWithdrawn) {
        balance -= fundsWithdrawn;
    }


}
