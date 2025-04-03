package behavioral.ObservorPattern.observable;

import behavioral.ObservorPattern.observor.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void reminder();

    public void setStockCount(int newCount);

    public int getStockCount();
}
