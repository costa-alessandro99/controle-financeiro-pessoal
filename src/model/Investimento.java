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

    public Investimento(double valorAplicado, LocalDate data) {
        //this.nome = nome;
        this.valorAplicado = valorAplicado;
        //this.porcentagem = porcentagem;
        this.data = data;
    }

//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

//    public double getPorcentagem() {
//        return porcentagem;
//    }
//
//    public void setPorcentagem(double porcentagem) {
//        this.porcentagem = porcentagem;
//    }

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
        return String.format("Valor aplicado em investimentos: R$%.2f", valorAplicado) +
                ", data do aporte: " + data.format(DTF);
    }

}
