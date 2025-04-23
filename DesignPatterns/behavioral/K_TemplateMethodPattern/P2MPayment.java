package DesignPatterns.behavioral.K_TemplateMethodPattern;

public class P2MPayment extends Payment{
    public P2MPayment(double paymentAmount) {
        super(paymentAmount);
    }

    @Override
    public void initiatePayment() {
        System.out.println("Payment Initiated for Amount" + paymentAmount);
    }

    @Override
    public void calculateCharges() {
        paymentCharges = paymentAmount * 2 / 100;
        System.out.println("charges for P2M Payment." + paymentCharges);
    }

    @Override
    public void debitFromSender() {
        System.out.println(" Amount debited from sender " + (paymentAmount + paymentCharges));

    }

    @Override
    public void creditToReceiver() {
        System.out.println(" Amount Credied To Receiver " + (paymentAmount + paymentCharges));
    }
}
