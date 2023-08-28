package BehavioralDesignPatterns.ObserverDesignPattern.Observer;

import BehavioralDesignPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String userName;

    private StocksObservable stocksObservable;

    public MobileAlertObserverImpl(String userName, StocksObservable stocksObservable){
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(userName, stocksObservable.getStockCount());
    }

    private void sendMessageOnMobile(String userName, Integer data){
        System.out.println("Message sent to " + userName + " with data "+ data);
    }
}
