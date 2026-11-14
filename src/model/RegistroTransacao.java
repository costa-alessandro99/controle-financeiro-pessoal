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

    public void registrarTransacao(TipoTransacao tipoTransacao) {

        System.out.print("Digite o valor: R$");
        double value = sc.nextDouble();
        System.out.println();

        Transacao transacao = new Transacao(value, tipoTransacao, LocalDate.now());
        management.addTransacao(transacao);

    }

    public void consultarTransacoes() {
        management.exibirTransacoes();


    }


}
