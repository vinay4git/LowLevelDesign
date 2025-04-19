package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;

public class CardInsertedStateImpl implements AtmState {
    @Override
    public void pinVerification(ATM atm, int pin) {
     if (atm.getEnteredCard().verifyPin(pin)) {
         System.out.println("Pin Verification succesfull. Please select the operation");
         atm.setAtmState(new SelectOperationImpl());
     } else {
         System.out.println("Pin Enter valid PIN");
         returnCard();
         atm.setAtmState(new IdleAtmStateImpl());
     }
    }

}
