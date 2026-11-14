package model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FinancialManagement {

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private List<Transacao> transacoes = new ArrayList<>();
    private List<Investimento> investimentos = new ArrayList<>();

    public void addTransacao(Transacao transacao) {
        transacoes.add(transacao);

    }

    public void addInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public double getTotalReceitas() {
        double total = 0.0;
        for (Transacao transacao : transacoes) {
            if (transacao.getTipoTransacao() == TipoTransacao.RECEITA) {
                total += transacao.getValor();

            }
        }
        return total;
    }

    public double getTotalDespesas() {
        double total = 0.0;
        for (Transacao transacao : transacoes) {
            if (transacao.getTipoTransacao() == TipoTransacao.DESPESA) {
                total += transacao.getValor();

            }
        }
        return total;
    }

    public double getSaldoTotal() {
        return getTotalReceitas() - getTotalDespesas();

    }

    public double getTotalInvestido() {
        double total = 0.0;
        for (Investimento investimento : investimentos) {
            total += investimento.getValorAplicado();

        }
        return total;
    }

    public void exibirTransacoes() {
        if (transacoes.isEmpty()) {
            System.out.println("*** Nenhuma transação cadastrada. ***");
            System.out.println();
            return;
        }
        System.out.println();
        System.out.println("=====| TRANSAÇÕES: |=====");
        System.out.println();
        System.out.println("RECEITAS:");

        for (Transacao transacao : transacoes) {
            if (transacao.getTipoTransacao() == TipoTransacao.RECEITA) {

                System.out.printf("Valor: R$ %.2f - Data: %s\n", transacao.getValor(), transacao.getData().format(DTF));
            }
        }

        System.out.println();
        System.out.println("DESPESAS:");
        System.out.println();

        for (Transacao transacao : transacoes) {
            if (transacao.getTipoTransacao() == TipoTransacao.DESPESA) {

                System.out.printf("Valor: R$ %.2f - Data: %s\n", transacao.getValor(), transacao.getData().format(DTF));
            }
        }
        System.out.println();
    }


    public void exibirInvestimentos() {
        if (investimentos.isEmpty()) {
            System.out.println("*** Nenhum investimento cadastrado. ***");
            return;
        }
        System.out.println();
        System.out.println("=====| INVESTIMENTOS: |=====");
        System.out.println();
        for (Investimento investimento : investimentos) {

            System.out.println(investimento);
            System.out.println();
        }

    }

    public double exibirPatrimonioTotal() {
        return getSaldoTotal() + getTotalInvestido();

    }

}

//            System.out.printf("Nome do investimento: %s,\nValor investido: R$%.2f,\nPrevisão em um ano: R$%.2f,\nData %s.",
//            investimento.getNome(),
//            investimento.getValorAplicado(),
//            investimento.previsaoInvestimento(),
//            investimento.getData().format(DTF));

