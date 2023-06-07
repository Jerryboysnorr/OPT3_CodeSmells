package org.example;

import java.time.chrono.MinguoEra;
import java.util.ArrayList;
import java.util.Observer;

public class personenAuto extends Product{
    private String Merk;
    private int Gewicht;

    public personenAuto(String naam, String Omschrijving, org.example.productVerhuur productVerhuur, String Merk, int Gewicht) {
        super(naam, Omschrijving, productVerhuur);
        this.Merk = Merk;
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

    public String getMerk() {
        return Merk;
    }

    public int getGewicht() {
        return Gewicht;
    }
}
