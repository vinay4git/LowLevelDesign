package LowLevelDesigns.ATMDesign.state;

import LowLevelDesigns.ATMDesign.objects.ATM;
import LowLevelDesigns.ATMDesign.objects.OperationType;

public class SelectOperationImpl extends AtmState {

    @Override
    public  void operationSelection(ATM atm, OperationType operationType) {
        switch (operationType) {
            case CHECK_BALANCE -> {
                atm.setAtmState(new DisplayBalanceImpl());
                returnCard();
                atm.setAtmState(new IdleAtmStateImpl());
            }

            case CASH_WITHDRAW -> {
                System.out.println("Plese enter amount to withdraw");
                atm.setAtmState(new EnterAmountStateImpl());
            }

            default -> super.operationSelection(atm, operationType);
        }
    }
}
