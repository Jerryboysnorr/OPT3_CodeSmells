package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class personenAuto extends Product{
    private String Merk;
    private int Gewicht;

    public personenAuto(String naam, ArrayList<verhuurObserver> observers, String Omschrijving, org.example.productVerhuur productVerhuur, String Merk, int Gewicht) {
        super(naam, observers, Omschrijving, productVerhuur);
        this.Merk = Merk;
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
