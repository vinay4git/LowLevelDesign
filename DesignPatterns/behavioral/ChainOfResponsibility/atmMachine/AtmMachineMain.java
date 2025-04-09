package DesignPatterns.behavioral.ChainOfResponsibility.atmMachine;

public class AtmMachineMain {
    public static void main(String[] args) {
        CashDispenser cashDispenser = new ThousandDispenser(new FiveHundredDispenser(new HundredDispenser(null)));

        cashDispenser.dispense(1700);
    }
}
