package DesignPatterns.structural.C_CompositePattern.ArithmaticCalculation;

public enum OperationType {
    ADD("+"),
    SUBSTRACT("-"),
    MULTIPLY("*"),
    DIVIDE("/");

    final String operation;
    OperationType(String operation) {
        this.operation = operation;
    }
}
