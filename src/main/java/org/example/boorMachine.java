package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class boorMachine extends Product{
    private String Merk;
    private String Type;

    public boorMachine(String naam, String Omschrijving, org.example.productVerhuur productVerhuur, String Merk, String Type) {
        super(naam, Omschrijving, productVerhuur);
        this.Merk = Merk;
        this.Type = Type;
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

    public String getType() {
        return Type;
    }
}
