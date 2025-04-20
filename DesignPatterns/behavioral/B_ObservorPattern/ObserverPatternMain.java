package DesignPatterns.behavioral.B_ObservorPattern;

import DesignPatterns.behavioral.B_ObservorPattern.observable.IphoneObservable;
import DesignPatterns.behavioral.B_ObservorPattern.observable.StockObservable;
import DesignPatterns.behavioral.B_ObservorPattern.observor.EmailNotificationObserver;
import DesignPatterns.behavioral.B_ObservorPattern.observor.MobileNotificationObserver;

public class ObserverPatternMain {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        new EmailNotificationObserver("xyz", iphoneObservable);
        new MobileNotificationObserver(32432432, iphoneObservable);
        new EmailNotificationObserver("abc", iphoneObservable);

        iphoneObservable.setStockCount(10);
    }
}
