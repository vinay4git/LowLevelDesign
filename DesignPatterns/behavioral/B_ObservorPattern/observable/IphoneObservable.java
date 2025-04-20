package DesignPatterns.behavioral.B_ObservorPattern.observable;

import DesignPatterns.behavioral.B_ObservorPattern.observor.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{

    List<NotificationAlertObserver> notificationAlertObservers = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObservers.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        notificationAlertObservers.remove(notificationAlertObserver);
    }

    @Override
    public void reminder() {
        for(NotificationAlertObserver subscribers : notificationAlertObservers) {
            subscribers.update();
        }
    }

    @Override
    public void setStockCount(int newCount) {
        if (this.stockCount == 0 & newCount > 0 ) {
            reminder();
        }

        this.stockCount += newCount;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}
