package ObserverDesignPattern.Observable;

import ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable{

    List<NotificationAlertObserver> observerList = new ArrayList<>();

    Integer stockCount = 0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        observerList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : observerList){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(Integer newStock) {
        if(this.stockCount==0){
            notifySubscribers();
        }

        this.stockCount = newStock;
    }

    @Override
    public Integer getStockCount() {
        return this.stockCount;
    }
}
