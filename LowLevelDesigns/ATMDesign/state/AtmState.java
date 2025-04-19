package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.Card;
import LowLevelDesigns.ATMDesign.objects.OperationType;

public interface AtmState {
     default void cardEntered(ATM atm, Card card) {
        System.out.println("OOPS! Invalid Operation.");
    }

    default void pinVerification(ATM atm, int pin) {
        System.out.println("OOPS! Invalid Operation.");
    }

    default void operationSelection(ATM atm,  OperationType operationType) {
        System.out.println("OOPS! Invalid Operation.");
    }

    default void enterWithDrawAmount(ATM atm, int withdrawAmount) {
        System.out.println("OOPS! Invalid Operation.");
    }

    default void displayAmount(ATM atm) {
        System.out.println("OOPS! Invalid Operation.");
    }

    default void returnCard() {
        System.out.println("Please collect your card");
    }
}
