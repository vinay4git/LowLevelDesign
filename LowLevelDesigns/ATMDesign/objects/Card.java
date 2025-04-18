package LowLevelDesigns.ATMDesign.objects;

public class Card {
    private int cardNumber;
    private BankAccount bankAccount;
    private int pinNumber;



    public Card(int cardNumber, BankAccount bankAccount, int pinNumber) {
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
        this.pinNumber = pinNumber;
    }

    public boolean verifyPin(int enteredPin) {
        return pinNumber == enteredPin;
    }

    public int checkBalance () {
        return bankAccount.getBalance();
    }

    public void deductBalance(int amount) {
        this.bankAccount.deductBalance(amount);
    }
}
