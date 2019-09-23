import java.util.ArrayList;


public class Bank {

    private int balance = 0;

    ArrayList<ArrayList> transactionHistory = new ArrayList<ArrayList>(0);

    public int balance() {
        return balance;
    }

    public void credit(int fundsCredited) {
        balance += fundsCredited;
        debitTransaction(fundsCredited);

        System.out.println(transactionHistory);
    }

    public void debit(int fundsDebited) {
        balance -= fundsDebited;
        creditTransaction(fundsDebited);

        System.out.println(transactionHistory);
    }

    private void debitTransaction(int fundsDebited) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsDebited);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

    private void creditTransaction(int fundsCredited) {
        ArrayList<Integer> newTransaction = new ArrayList<Integer>(0);
        newTransaction.add(fundsCredited);
        newTransaction.add(balance);
        transactionHistory.add(newTransaction);
    }

}
