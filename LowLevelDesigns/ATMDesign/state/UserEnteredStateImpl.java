package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.Card;

public class UserEnteredStateImpl extends AtmState{
    public void cardEntered(ATM atm, Card card) {
        System.out.println("Please enter valid PIN");
        atm.setEnteredCard(card);
        atm.setAtmState(new SelectOperationImpl());
    }
}
