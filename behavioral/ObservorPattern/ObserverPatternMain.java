package behavioral.ObservorPattern;

import behavioral.ObservorPattern.observable.IphoneObservable;
import behavioral.ObservorPattern.observable.StockObservable;
import behavioral.ObservorPattern.observor.EmailNotificationObserver;
import behavioral.ObservorPattern.observor.MobileNotificationObserver;

public class ObserverPatternMain {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        new EmailNotificationObserver("xyz", iphoneObservable);
        new MobileNotificationObserver(32432432, iphoneObservable);
        new EmailNotificationObserver("abc", iphoneObservable);

        iphoneObservable.setStockCount(10);
    }
}
