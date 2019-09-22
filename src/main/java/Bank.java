public class Bank {

    private int balance = 0;

    public void deposit(int fundsDeposited) {
        balance += fundsDeposited;
    }

    public int balance() {
        return balance;
    }

}
