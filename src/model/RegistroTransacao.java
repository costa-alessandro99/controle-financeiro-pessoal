package model;

import java.time.LocalDate;
import java.util.Scanner;

public class RegistroTransacao {

    private FinancialManagement management;
    private Scanner sc;

    public RegistroTransacao(FinancialManagement management, Scanner sc){
        this.management = management;
        this.sc = sc;

    }

    public void registrarTransacao() {
        TipoTransacao tipoTransacao;


        System.out.print("Digite o valor: R$");
        double value = sc.nextDouble();

        System.out.println("Qual o tipo de transação? ");
        System.out.println("1 - Receita");
        System.out.println("2 - Despesa");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                tipoTransacao = TipoTransacao.RECEITA;
                break;

            case 2:
                tipoTransacao = TipoTransacao.DESPESA;
                break;

            default:
                System.out.println("Opção inválida");
                return;

        }

        Transacao transacao = new Transacao(value, LocalDate.now(), tipoTransacao);
        management.addTransacao(transacao);
    }


}
