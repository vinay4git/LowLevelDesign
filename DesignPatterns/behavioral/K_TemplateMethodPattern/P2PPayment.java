package DesignPatterns.behavioral.K_TemplateMethodPattern;

public class P2PPayment extends Payment{

    public P2PPayment(double paymentAmount) {
        super(paymentAmount);
    }

    @Override
    public void initiatePayment() {
        System.out.println("Payment Initiated for Amount" + paymentAmount);
    }

    @Override
    public void calculateCharges() {
        System.out.println("No charges for P2P Payment.");
        paymentCharges = 0;
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
