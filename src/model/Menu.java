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

            System.out.print("\nEscolha: ");

            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    menuTransacoes();
                    break;

                case 2:

                    menuInvestimentos();
                    break;

                case 3:

                    resumoFinanceiro.resumoTotal();
                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o sistema.");
                    System.out.print("Pressione ENTER para sair...");
                    sc.nextLine();
                    sc.nextLine();
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        } while (opcao != 4);

    }

    private void menuTransacoes() {

        int opcao;

        do {
            System.out.println("===== |TRANSAÇÕES |=====");
            System.out.println("\nDigite a opção desejada: ");
            System.out.println("1 - Registrar Transação");
            System.out.println("2 - Registrar Despesa");
            System.out.println("3 - Exibir informações");
            System.out.println("0 - Retornar ao menu principal");

            System.out.print("\nEscolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    registroTransacao.registrarTransacao(TipoTransacao.RECEITA);
                    break;

                case 2:
                    registroTransacao.registrarTransacao(TipoTransacao.DESPESA);
                    break;

                case 3:
                    registroTransacao.consultarTransacoes();

                    break;

                case 0:
                    System.out.println("Retornando ao menu...");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente.");

            }
        } while (opcao != 0);

    }

    private void menuInvestimentos() {
        int opcao;

        do {
            System.out.println("===== | INVESTIMENTOS |=====");
            System.out.println("\nDigite a opção desejada: ");
            System.out.println("1 - Registrar investimento");
            System.out.println("0 - Retornar ao menu principal");

            System.out.print("\nEscolha: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    registroInvestimento.registrarInvestimento();
                    break;

                case 0:
                    System.out.println("Retornando ao menu...");
                    break;

                default:
                    System.out.println("Opção Inválida, tente novamente.");

            }
        } while (opcao != 0);

    }
}
