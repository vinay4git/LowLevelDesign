package behavioral.ObservorPattern.observor;

import behavioral.ObservorPattern.observable.StockObservable;

public class EmailNotificationObserver implements NotificationAlertObserver{

    private String emailId;
    private StockObservable stockObservable;

    public EmailNotificationObserver(String emailId, StockObservable stockObservable) {
        this.emailId = emailId;
        this.stockObservable = stockObservable;
        stockObservable.add(this);
    }

    @Override
    public void update() {
        System.out.println("The product you want is in stock email " + emailId);
    }
}
