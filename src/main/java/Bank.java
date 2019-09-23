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

    public void debit(int fundsDebited) {
        balance -= fundsDebited;
        creditTransaction(fundsDebited);

        System.out.println(transactionHistory);
    }

    public void debitTransaction(int fundsDeposited) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsDeposited);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

    public void creditTransaction(int fundsDebited) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsDebited);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

}
