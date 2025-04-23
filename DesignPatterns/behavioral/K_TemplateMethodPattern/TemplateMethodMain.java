package DesignPatterns.behavioral.K_TemplateMethodPattern;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Payment p2MPayment = new P2MPayment(100);

        p2MPayment.doPayment();

        Payment p2PPayment = new P2PPayment(100);

        p2PPayment.doPayment();
    }
}
