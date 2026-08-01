package model;

import java.util.Scanner;

public class Menu {

    private Scanner sc = new Scanner(System.in);
    private FinancialManagement management = new FinancialManagement();
    private RegistroTransacao registroTransacao = new RegistroTransacao(management, sc);
    private RegistroInvestimento registroInvestimento = new RegistroInvestimento(management, sc);
    private ResumoFinanceiro resumoFinanceiro = new ResumoFinanceiro(management);

    public void start() {

        int opcao;

        System.out.println("***** MENU INICIAL - CONTROLE FINANCEIRO PESSOAL *****");
        System.out.println("===== BEM VINDO(A)! =====");

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println();
            System.out.println("1 - Transações");
            System.out.println("2 - Investimentos");
            System.out.println("3 - Resumo Financeiro");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    registroTransacao.registrarTransacao();
                    break;

                case 2:

                    registroInvestimento.registrarInvestimento();
                    break;

                case 3:

                    resumoFinanceiro.resumoTotal();
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        } while (opcao != 4);

    }
}
