package model;

public class Investment {

    private String name;
    private double appliedValue;

    public Investment() {
    }

    public Investment(String name, double appliedValue) {
        this.name = name;
        this.appliedValue = appliedValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAppliedValue() {
        return appliedValue;
    }

    public void setAppliedValue(double appliedValue) {
        this.appliedValue = appliedValue;
    }

    @Override
    public String toString() {
        return "INVESTMENT:\n" +
                "Investment name: " +
                name +
                String.format(", applied value: R$%.2f\n", appliedValue);
    }

}
