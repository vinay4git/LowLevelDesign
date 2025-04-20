package DesignPatterns.behavioral.C_ChainOfResponsibility.atmMachine;

public class ThousandDispenser extends CashDispenser{
    public ThousandDispenser(CashDispenser cashDispenser) {
        super(cashDispenser);
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 1000) {
            int remaining = amount % 1000;
            int thousandDispenseCount = amount / 1000;
            System.out.println( " dispense 1000s of Count " + thousandDispenseCount);

            super.dispense(remaining);
        } else {
            super.dispense(amount);
        }
    }
}
