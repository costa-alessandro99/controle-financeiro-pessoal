package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transacao {

    private double valor;
    private LocalDate data;
    private TipoTransacao tipoTransacao;


    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Transacao() {
    }

    public Transacao(double valor, TipoTransacao tipoTransacao, LocalDate data) {
        this.valor = valor;
        this.tipoTransacao = tipoTransacao;
        this.data = data;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public TipoTransacao getTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(TipoTransacao tipoTransacao) {
        this.tipoTransacao = tipoTransacao;

    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return String.format("Valor: R$%.2f", valor) +
                ", data: " +
                data.format(DTF) +
                ", tipo de transação: " +
                tipoTransacao;
    }

}
