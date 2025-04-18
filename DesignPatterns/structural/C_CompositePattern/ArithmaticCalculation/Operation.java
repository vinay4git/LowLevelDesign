package DesignPatterns.structural.C_CompositePattern.ArithmaticCalculation;

public class Operation implements ArithmeticOperations{
    private final OperationType operationType;
    private final ArithmeticOperations leftEvaluation;
    private final ArithmeticOperations rightEvaluation;

    public Operation(OperationType operationType, ArithmeticOperations leftEvaluation, ArithmeticOperations rightEvaluation) {
        this.operationType = operationType;
        this.leftEvaluation = leftEvaluation;
        this.rightEvaluation = rightEvaluation;
    }

    @Override
    public double evaluate() {
        switch (operationType) {
            case ADD -> {
                return leftEvaluation.evaluate() + rightEvaluation.evaluate();
            }
            case SUBSTRACT -> {
                return leftEvaluation.evaluate() - rightEvaluation.evaluate();
            }
            case MULTIPLY -> {
                return leftEvaluation.evaluate() * rightEvaluation.evaluate();
            }
            case DIVIDE -> {
                return leftEvaluation.evaluate() / rightEvaluation.evaluate();
            }
        }
        return 0;
    }
}
