package LowLevelDesigns.ATMDesign.objects;

public class BankAccount {
    private int balance;
    private int accountNumber;

    public BankAccount(int balance, int accountNumber) {
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public int withDraw(int withdrawAmount) {
        if (balance > withdrawAmount) {
            balance -= withdrawAmount;
        }
        return withdrawAmount;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        this.balance -= amount;
    }
}
