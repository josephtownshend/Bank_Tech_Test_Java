import java.util.ArrayList;


public class Bank {

    private int balance = 0;

    ArrayList<ArrayList> transactionHistory = new ArrayList<ArrayList>(0);

    public int balance() {
        return balance;
    }

    public void credit(int fundsDeposited) {
        balance += fundsDeposited;
        debitTransaction(fundsDeposited);

        System.out.println(transactionHistory);
    }

    public void withdraw(int fundsWithdrawn) {
        balance -= fundsWithdrawn;
        creditTransaction(fundsWithdrawn);

        System.out.println(transactionHistory);
    }

    public void debitTransaction(int fundsDeposited) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsDeposited);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

    public void creditTransaction(int fundsWithdrawn) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsWithdrawn);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

}
