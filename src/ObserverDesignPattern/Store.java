package ObserverDesignPattern;

import ObserverDesignPattern.Observable.IphoneObservableImpl;
import ObserverDesignPattern.Observable.StocksObservable;
import ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import ObserverDesignPattern.Observer.NotificationAlertObserver;

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
