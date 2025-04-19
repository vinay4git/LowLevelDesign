package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.OperationType;

import java.util.Objects;

public class SelectOperationImpl implements AtmState {

    public void operationSelection(ATM atm, OperationType operationType) {
        if (Objects.requireNonNull(operationType) == OperationType.CHECK_BALANCE) {
            atm.setAtmState(new DisplayBalanceImpl());
            returnCard();
            atm.setAtmState(new IdleAtmStateImpl());
        } else if (operationType == OperationType.CASH_WITHDRAW) {
            System.out.println("Plese enter amount to withdraw");
            atm.setAtmState(new EnterAmountStateImpl());
        } else {
            AtmState.super.operationSelection(atm, operationType);
        }
    }
}
