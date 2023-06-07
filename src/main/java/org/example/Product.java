package org.example;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product {
    private ArrayList<verhuurObserver> observers = new ArrayList<>();
    private String naam;
    private String Omschrijving;
    private productVerhuur productVerhuur;

    public Product(String naam, ArrayList<verhuurObserver> observers, String Omschrijving, productVerhuur productVerhuur){
        this.naam = naam;
        this.observers = observers;
        this.Omschrijving = Omschrijving;
        this.productVerhuur = productVerhuur;
    }




    abstract void inform();
    abstract void notifyObservers();
    abstract void verhuur();

    void verhuurProces(){

    }

    public String getNaam() {
        return naam;
    }

    public org.example.productVerhuur getProductVerhuur() {
        return productVerhuur;
    }

    public ArrayList<verhuurObserver> getObservers() {
        return observers;
    }



    public String getOmschrijving() {
        return Omschrijving;
    }


}
