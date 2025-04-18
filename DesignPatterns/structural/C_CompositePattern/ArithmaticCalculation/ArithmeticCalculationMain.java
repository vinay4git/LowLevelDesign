package DesignPatterns.structural.C_CompositePattern.ArithmaticCalculation;

public class ArithmeticCalculationMain {
    public static void main(String[] args) {

        //2*(1+7)

       /*

                         *
                       /   \
                     2      +
                           / \
                          1   7

        */


        ArithmeticOperations two = new Number(2.0);

        ArithmeticOperations one = new Number(1.0);
        ArithmeticOperations seven = new Number(7.0);

        ArithmeticOperations addExpression = new Operation(OperationType.ADD, one, seven);

        ArithmeticOperations parentExpression = new Operation(OperationType.MULTIPLY, two, addExpression);

        System.out.println(parentExpression.evaluate());
    }

}
