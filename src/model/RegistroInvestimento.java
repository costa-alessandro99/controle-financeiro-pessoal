package model;

import java.time.LocalDate;
import java.util.Scanner;

public class RegistroInvestimento {

    private FinancialManagement management;
    private Scanner sc;

    public RegistroInvestimento(FinancialManagement management, Scanner sc) {
        this.management = management;
        this.sc = sc;
    }

    public void registrarInvestimento() {

        sc.nextLine();

        System.out.print("Digite o valor do investimento: R$");
        double valorInvestimento = sc.nextDouble();
        System.out.println();

        Investimento investimento = new Investimento(valorInvestimento, LocalDate.now());
        management.addInvestimento(investimento);

    }
}
