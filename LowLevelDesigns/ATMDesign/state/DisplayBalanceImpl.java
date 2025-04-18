package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;

public class DisplayBalanceImpl extends AtmState {

    public void displayAmount(ATM atm) {
        int balance = atm.getEnteredCard().checkBalance();
        System.out.println("your current balance is " + balance);

        System.out.println("Thank You ! Visit Again");
        returnCard();
        atm.setAtmState(new IdleAtmStateImpl());
    }
}
