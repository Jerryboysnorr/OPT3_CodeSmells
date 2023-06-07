package org.example;

import java.util.ArrayList;

public class verhuurManager {
    String verhuurUpdate;
    ArrayList<verhuurObserver> observers;
    public void notifyAllObservers(Product product){
        for (verhuurObserver observer : observers) {
            observer.update(this.verhuurUpdate, product);
        }
    }

    void setObservers(){
        observers = new ArrayList<verhuurObserver>();
        observers.add(new boormachineObserver());
        observers.add(new vrachtautoObserver());
        observers.add(new personenautoObserver());
    }

    void setVerhuurUpdate(String verhuurUpdate, Product product){
        this.verhuurUpdate = verhuurUpdate;
        notifyAllObservers(product);
    }

}
