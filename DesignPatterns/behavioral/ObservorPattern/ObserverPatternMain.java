package DesignPatterns.behavioral.ObservorPattern;

import DesignPatterns.behavioral.ObservorPattern.observable.IphoneObservable;
import DesignPatterns.behavioral.ObservorPattern.observable.StockObservable;
import DesignPatterns.behavioral.ObservorPattern.observor.EmailNotificationObserver;
import DesignPatterns.behavioral.ObservorPattern.observor.MobileNotificationObserver;

public class ObserverPatternMain {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        new EmailNotificationObserver("xyz", iphoneObservable);
        new MobileNotificationObserver(32432432, iphoneObservable);
        new EmailNotificationObserver("abc", iphoneObservable);

        iphoneObservable.setStockCount(10);
    }
}
