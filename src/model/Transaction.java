package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Transaction {

    private double value;
    private LocalDate date;
    private TypeTransaction typeTransaction;

    private static final DateTimeFormatter DTF = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Transaction(){
    }

    public Transaction(double value, LocalDate date, TypeTransaction typeTransaction) {
        this.value = value;
        this.date = date;
        this.typeTransaction = typeTransaction;

    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public TypeTransaction getTypeTransaction() {
        return typeTransaction;
    }

    public void setTypeTransaction(TypeTransaction typeTransaction) {
        this.typeTransaction = typeTransaction;

    }

    @Override
    public String toString() {
        return "TRANSACTION:\n" +
                String.format("Value: R$%.2f", value) +
                ", date: " +
                date.format(DTF) +
                ", type transaction: " +
                typeTransaction +
                "\n";

    }

}
