package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class vrachtAuto extends Product{
    private int laadVermogen;
    private int Gewicht;

    public vrachtAuto(String naam, ArrayList<verhuurObserver> observers, String Omschrijving, org.example.productVerhuur productVerhuur, int Gewicht, int laadVermogen) {
        super(naam, observers, Omschrijving, productVerhuur);
        this.laadVermogen = laadVermogen;
        this.Gewicht = Gewicht;
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
