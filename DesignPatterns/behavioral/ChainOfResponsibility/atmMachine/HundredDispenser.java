package DesignPatterns.behavioral.ChainOfResponsibility.atmMachine;

public class HundredDispenser extends CashDispenser{
    public HundredDispenser(CashDispenser cashDispenser) {
        super(cashDispenser);
    }

    @Override
    public void dispense(int amount) {
        if (amount >= 100) {
            int remaining = amount % 100;
            int thousandDispenseCount = amount / 100;
            System.out.println( " dispense 100s of Count " + thousandDispenseCount);

            super.dispense(remaining);
        } else {
            super.dispense(amount);
        }
    }
}
