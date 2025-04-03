package behavioral.ObservorPattern.observor;

import behavioral.ObservorPattern.observable.StockObservable;

public class MobileNotificationObserver implements NotificationAlertObserver{

    Integer mobileNbr;
    StockObservable stockObservable;

    public MobileNotificationObserver(Integer mobileNbr, StockObservable stockObservable) {
        this.mobileNbr = mobileNbr;
        this.stockObservable = stockObservable;
        stockObservable.add(this);
    }

    @Override
    public void update() {
        System.out.println("Product is availalbe mobileNbr" + mobileNbr);
    }
}
