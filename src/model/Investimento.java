package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Investimento {

    private String nome;
    private double valorAplicado;
    private LocalDate data;

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Investimento() {
    }

    public Investimento(String nome, double valorAplicado, LocalDate data) {
        this.nome = nome;
        this.valorAplicado = valorAplicado;
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
    public LocalDate getData(){
        return data;
    }
    public void setData(LocalDate data){
        this.data = data;
    }

    @Override
    public String toString() {
        return "INVESTIMENTOS:\n" +
                "Nome do investimento: " +
                nome +
                String.format(", valor aplicado: R$%.2f", valorAplicado) +
                ", data: " + data.format(DTF);
    }

}
