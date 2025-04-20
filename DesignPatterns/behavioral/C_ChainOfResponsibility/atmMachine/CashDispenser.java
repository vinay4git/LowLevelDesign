package DesignPatterns.behavioral.C_ChainOfResponsibility.atmMachine;

public abstract class CashDispenser {
    CashDispenser nextCashDispenser;

    public CashDispenser(CashDispenser nextCashDispenser) {
        this.nextCashDispenser = nextCashDispenser;
    }

    public void dispense(int amount) {
        if (amount == 0) {
            System.out.println("Cash Withdrawn successfully");
            return;
        }

        if (nextCashDispenser != null) {
            nextCashDispenser.dispense(amount);
        } else {
            System.out.println("Not able to dispense desired amount");
        }
    }
}
