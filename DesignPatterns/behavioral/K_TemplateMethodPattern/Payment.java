package DesignPatterns.behavioral.K_TemplateMethodPattern;

public abstract class Payment {
    double paymentAmount;
    double paymentCharges;

    public Payment(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public abstract void initiatePayment();
    public abstract void calculateCharges();
    public abstract void debitFromSender();
    public abstract void creditToReceiver();

    public final void doPayment() {
        initiatePayment();
        calculateCharges();
        debitFromSender();
        creditToReceiver();
    }
}
