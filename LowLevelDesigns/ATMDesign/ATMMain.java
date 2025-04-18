package LowLevelDesigns.ATMDesign;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.BankAccount;
import LowLevelDesigns.ATMDesign.objects.Card;
import LowLevelDesigns.ATMDesign.objects.OperationType;

public class ATMMain {
    public static void main(String[] args) {
        ATM atmObject = ATM.getAtmObject();

        atmObject.addAtmBalance(1000);

        BankAccount bankAccount = new BankAccount(5000, 1231232132);
        Card card = new Card(123124, bankAccount, 1234);

        atmObject.getAtmState().cardEntered(atmObject, card);

        atmObject.getAtmState().pinVerification(atmObject, 1234);

        atmObject.getAtmState().operationSelection(atmObject, OperationType.CASH_WITHDRAW);

        atmObject.getAtmState().enterWithDrawAmount(atmObject, 500);
    }
}