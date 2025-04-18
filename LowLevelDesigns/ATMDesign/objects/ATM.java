package LowLevelDesigns.ATMDesign.objects;

import LowLevelDesigns.ATMDesign.state.AtmState;
import LowLevelDesigns.ATMDesign.state.IdleAtmStateImpl;

public class ATM {
    private Card enteredCard;
    private int atmBalance=0;
    private AtmState atmState;

    private static final ATM atmObject = new ATM();

    public ATM() {
    }

    public static ATM getAtmObject() {
        atmObject.atmState = new IdleAtmStateImpl();
        return atmObject;
    }

    public void setEnteredCard(Card enteredCard) {
        this.enteredCard = enteredCard;
    }

    public Card getEnteredCard() {
        return enteredCard;
    }

    public void setAtmState(AtmState atmState) {
        this.atmState = atmState;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public void addAtmBalance(int atmBalance) {
        this.atmBalance += atmBalance;
    }

    public AtmState getAtmState() {
        return atmState;
    }

    public void deductAtmAmount(int withdrawAmount) {
        this.atmBalance -= withdrawAmount;
    }
}
