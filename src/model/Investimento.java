package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Investimento {

    private String nome;
    private double valorAplicado, porcentagem;
    private LocalDate data;

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Investimento() {
    }

    public Investimento(String nome, double valorAplicado, double porcentagem, LocalDate data) {
        this.nome = nome;
        this.valorAplicado = valorAplicado;
        this.porcentagem = porcentagem;
        this.data = data;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double previsaoInvestimento() {

        double rendimento = valorAplicado * (porcentagem / 100);
        return valorAplicado + rendimento;

    }

    @Override
    public String toString() {
        return "Nome do investimento: " + nome +
                String.format(", valor aplicado: R$%.2f", valorAplicado) +
                String.format(", previsão em um ano: R$%.2f", previsaoInvestimento()) +
                ", data do aporte: " + data.format(DTF);
    }

}
