package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class vrachtAuto extends Product{
    private int laadVermogen;
    private int Gewicht;

    public vrachtAuto(String naam, String Omschrijving, org.example.productVerhuur productVerhuur, int laadVermogen, int Gewicht) {
        super(naam, Omschrijving, productVerhuur);
        this.laadVermogen = laadVermogen;
        this.Gewicht = Gewicht;
    }


    @Override
    void inform() {
        System.out.println("\u001B[31m! \u001B[33mProduct gereserveerd en kan worden opgehaald.");
    }

    @Override
    void notifyObservers(String update, Product product) {
        Main.vm.setVerhuurUpdate(update, product);
    }

    @Override
    void verhuur(Gebruiker gebruiker, Medewerker medewerker) {
        getProductVerhuur().setVerhuurd(true);
        getProductVerhuur().setGehuurdDoor(gebruiker);
        getProductVerhuur().setVerhuurdDoor(medewerker);
    }

    public int getLaadVermogen() {
        return laadVermogen;
    }

    public int getGewicht() {
        return Gewicht;
    }
}



