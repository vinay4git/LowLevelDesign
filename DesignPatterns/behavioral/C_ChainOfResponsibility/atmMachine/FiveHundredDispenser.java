package DesignPatterns.behavioral.C_ChainOfResponsibility.atmMachine;

public class FiveHundredDispenser extends CashDispenser{
    public FiveHundredDispenser(CashDispenser cashDispenser) {
        super(cashDispenser);
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 500) {
            int remaining = amount % 500;
            int thousandDispenseCount = amount / 500;
            System.out.println( " dispense 500s of Count " + thousandDispenseCount);

            super.dispense(remaining);
        } else {
            super.dispense(amount);
        }
    }
}
