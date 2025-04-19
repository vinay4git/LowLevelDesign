package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.Card;

public class IdleAtmStateImpl implements AtmState {
    @Override
    public void cardEntered(ATM atm, Card card) {
        System.out.println("Please Enter your PIN");
        atm.setEnteredCard(card);
        atm.setAtmState(new CardInsertedStateImpl());
    }
}
