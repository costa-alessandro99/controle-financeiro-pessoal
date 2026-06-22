import model.FinancialManagement;
import model.Investimento;
import model.Transacao;
import model.TipoTransacao;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        FinancialManagement management = new FinancialManagement();

        int opcao;

        System.out.println("*****Menu Controle Financeiro*****");
        System.out.println("Bem vindo!");

        do {
            System.out.println("Digite a opção desejada:");
            System.out.println();
            System.out.println("1 - Transação");
            System.out.println("2 - Investimentos");
            System.out.println("3 - Mostrar totais");
            System.out.println("4 - Sair");

            opcao = sc.nextInt();
            switch (opcao) {

                case 1:
                    System.out.print("Digite o valor: R$");
                    double value = sc.nextDouble();

                    System.out.println("Qual o tipo de transação? ");
                    System.out.println("1 - Receita");
                    System.out.println("2 - Despesa");
                    int type = sc.nextInt();

                    TipoTransacao tipoTransacao;

                    if (type != 1 && type != 2) {
                        System.out.println("Tipo inválido.");
                        break;
                    }
                    if (type == 1) {
                        tipoTransacao = TipoTransacao.RECEITA;
                    } else {
                        tipoTransacao = TipoTransacao.DESPESA;
                    }

                    Transacao transacao = new Transacao(value, LocalDate.now(), tipoTransacao);
                    management.addTransacao(transacao);
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Digite o nome do investimento: ");
                    String investmentName = sc.nextLine();

                    System.out.print("Digite o valor do investimento: R$");
                    double investmentValue = sc.nextDouble();

                    Investimento investimento = new Investimento(investmentName, investmentValue, LocalDate.now());
                    management.addInvestimento(investimento);
                    break;

                case 3:
                    System.out.println("Valores adicionados: ");

                    System.out.printf("Receitas: R$%.2f\n", management.getTotalReceitas());
                    System.out.printf("Despesas: R$%.2f\n", management.getTotalDespesas());
                    System.out.println();

                    management.showInvestimento();
                    System.out.println();
                    System.out.printf("Saldo total disponível: R$%.2f\n", management.getSaldoTotal());
                    System.out.printf("Valor total investido: %.2f\n", management.getTotalInvestido());

                    break;

                case 4:
                    System.out.println("Obrigado por utilizar o sistema.");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");

            }

        } while (opcao != 4);

        sc.close();
    }

}
