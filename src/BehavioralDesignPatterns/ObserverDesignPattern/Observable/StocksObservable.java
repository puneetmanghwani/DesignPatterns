package BehavioralDesignPatterns.ObserverDesignPattern.Observable;

import BehavioralDesignPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubscribers();

    public void setStockCount(Integer stockCount);

    public Integer getStockCount();

}
