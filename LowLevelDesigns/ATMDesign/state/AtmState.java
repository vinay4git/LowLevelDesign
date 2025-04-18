package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.Card;
import LowLevelDesigns.ATMDesign.objects.OperationType;

public abstract class AtmState {
    public void cardEntered(ATM atm, Card card) {
        System.out.println("OOPS! Invalid Operation.");
    }

    public void pinVerification(ATM atm, int pin) {
        System.out.println("OOPS! Invalid Operation.");
    }

    public void operationSelection(ATM atm,  OperationType operationType) {
        System.out.println("OOPS! Invalid Operation.");
    }

    public void enterWithDrawAmount(ATM atm, int withdrawAmount) {
        System.out.println("OOPS! Invalid Operation.");
    }

    public void displayAmount(ATM atm) {
        System.out.println("OOPS! Invalid Operation.");
    }

    public void returnCard() {
        System.out.println("Please collect your card");
    }
}
