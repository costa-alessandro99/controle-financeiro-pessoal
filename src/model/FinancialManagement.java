package model;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class FinancialManagement {

    private List<Transacao> transacoes = new ArrayList<>();
    private List<Investimento> investimentos = new ArrayList<>();

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public void addTransacao(Transacao transacao) {
        transacoes.add(transacao);

    }

    public void addInvestimento(Investimento investimento) {
        investimentos.add(investimento);
    }

    public void showTransacoes() {
        for (Transacao transacao : transacoes) {
            System.out.println(transacao);
        }

    }

    public void showInvestimentos() {
        for (Investimento investimento : investimentos) {
            System.out.println(investimento);
        }

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

    public void showInvestimento() {
        if (investimentos.isEmpty()) {
            System.out.println("Nenhum investimento cadastrado.");
            return;
        }

        System.out.println("Investimentos: ");
        for (Investimento investimento : investimentos) {
            System.out.printf("Nome: %s, valor investido: R$%.2f, data %s.",
                    investimento.getNome(),
                    investimento.getValorAplicado(),
                    investimento.getData().format(DTF));
        }

    }

}
