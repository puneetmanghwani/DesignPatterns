package BehavioralDesignPatterns.ObserverDesignPattern.Observer;

import BehavioralDesignPatterns.ObserverDesignPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    private String email;

    private StocksObservable stocksObservable;

    public EmailAlertObserverImpl(String email, StocksObservable stocksObservable){
        this.email = email;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendEmail(email, stocksObservable.getStockCount());
    }

    private void sendEmail(String email, Integer data){
        System.out.println("Email sent to " + email + " with data " + data);
    }
}
