package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class boorMachine extends Product{
    private String Merk;
    private String Type;

    public boorMachine(String naam, ArrayList<verhuurObserver> observers, String Omschrijving, org.example.productVerhuur productVerhuur, String Merk, String Type) {
        super(naam, observers, Omschrijving, productVerhuur);
        this.Merk = Merk;
        this.Type = Type;
    }

    @Override
    void inform() {

    }

    @Override
    void notifyObservers() {

    }

    @Override
    void verhuur() {

    }
}
