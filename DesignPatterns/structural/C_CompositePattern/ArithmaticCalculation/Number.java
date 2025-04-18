package DesignPatterns.structural.C_CompositePattern.ArithmaticCalculation;

public class Number implements ArithmeticOperations{
    private Double value;

    public Number(Double value) {
        this.value = value;
    }


    @Override
    public double evaluate() {
        return value;
    }
}
