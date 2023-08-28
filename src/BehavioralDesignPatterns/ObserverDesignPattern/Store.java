package BehavioralDesignPatterns.ObserverDesignPattern;

import BehavioralDesignPatterns.ObserverDesignPattern.Observable.IphoneObservableImpl;
import BehavioralDesignPatterns.ObserverDesignPattern.Observable.StocksObservable;
import BehavioralDesignPatterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import BehavioralDesignPatterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import BehavioralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String args[]){
        StocksObservable iphoneStocksObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("a@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("b@gmail.com", iphoneStocksObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("newName", iphoneStocksObservable);

        iphoneStocksObservable.add(observer1);
        iphoneStocksObservable.add(observer2);
        iphoneStocksObservable.add(observer3);

        iphoneStocksObservable.setStockCount(10);
    }

}
