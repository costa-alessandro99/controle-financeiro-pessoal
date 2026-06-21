package model;

import java.util.ArrayList;
import java.util.List;

public class FinancialManagement {

    private List<Transaction> transactions = new ArrayList<>();
    private List<Investment> investments = new ArrayList<>();

    public void addTransaction (Transaction transaction) {
        transactions.add(transaction);

    }

    public void addInvestment (Investment investment) {
        investments.add(investment);
    }

    public void showTransactions() {
        for (Transaction transaction : transactions) {
            System.out.println(transaction);
        }

    }
    public void showInvestments() {
        for (Investment investment : investments) {
            System.out.println(investment);
        }
    }

}
