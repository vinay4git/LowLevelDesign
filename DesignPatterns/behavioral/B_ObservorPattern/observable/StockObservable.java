package DesignPatterns.behavioral.B_ObservorPattern.observable;

import DesignPatterns.behavioral.B_ObservorPattern.observor.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void reminder();

    public void setStockCount(int newCount);

    public int getStockCount();
}
