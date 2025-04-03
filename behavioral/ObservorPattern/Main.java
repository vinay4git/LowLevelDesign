package behavioral.ObservorPattern;

import behavioral.ObservorPattern.observable.IphoneObservable;
import behavioral.ObservorPattern.observable.StockObservable;
import behavioral.ObservorPattern.observor.EmailNotificationObserver;
import behavioral.ObservorPattern.observor.MobileNotificationObserver;
import behavioral.ObservorPattern.observor.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver no1 = new EmailNotificationObserver("xyz", iphoneObservable);
        NotificationAlertObserver no2 = new MobileNotificationObserver(32432432, iphoneObservable);
        NotificationAlertObserver no3 = new EmailNotificationObserver("abc", iphoneObservable);

        iphoneObservable.add(no1);
        iphoneObservable.add(no2);
        iphoneObservable.add(no3);

        iphoneObservable.setStockCount(10);
    }
}
