import model.FinancialManagement;
import model.Investment;
import model.Transaction;
import model.TypeTransaction;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        FinancialManagement management = new FinancialManagement();
        Transaction transaction = new Transaction(1000.00, LocalDate.now(), TypeTransaction.INCOME);
        Investment investment = new Investment("SELIC", 1500.00);

        management.addTransaction(transaction);
        management.addInvestment(investment);

        management.showTransactions();
        management.showInvestments();

        sc.close();
    }
}