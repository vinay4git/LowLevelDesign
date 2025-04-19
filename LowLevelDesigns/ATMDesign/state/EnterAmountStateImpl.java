package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;

public class EnterAmountStateImpl implements AtmState{

    @Override
    public void enterWithDrawAmount(ATM atm, int withdrawAmount) {
        int balance = atm.getEnteredCard().checkBalance();

        if (atm.getAtmBalance() < withdrawAmount) {
            System.out.println("Insufficeint Funds in ATM!");
            exit(atm);
        }

        if ( balance < withdrawAmount) {
            System.out.println("Insufficeint Funds in Your Bank Account!");
            exit(atm);
        }

        System.out.println("Dispense Amount");
        atm.getEnteredCard().deductBalance(withdrawAmount);
        atm.deductAtmAmount(withdrawAmount);

        exit(atm);
    }

    private void exit(ATM atm) {
        returnCard();
        atm.setAtmState(new IdleAtmStateImpl());
        System.out.println("Thank You Visit Again");
    }


}
