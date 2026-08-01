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
        System.out.print("Digite o nome do investimento: ");
        String nomeInvestimento = sc.nextLine().toUpperCase();

        System.out.print("Digite o valor do investimento: R$");
        double valorInvestimento = sc.nextDouble();

        System.out.println("Qual a porcentagem do investimento? (Caso não saiba, colocar 0). ");
        double porcentagem = sc.nextDouble();

        Investimento investimento = new Investimento(nomeInvestimento, valorInvestimento, porcentagem, LocalDate.now());
        management.addInvestimento(investimento);

    }
}
