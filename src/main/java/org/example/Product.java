package org.example;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product {
    private String naam;
    private String Omschrijving;
    private productVerhuur productVerhuur;

    public Product(String naam, String Omschrijving, productVerhuur productVerhuur){
        this.naam = naam;
        this.Omschrijving = Omschrijving;
        this.productVerhuur = productVerhuur;
    }




    abstract void inform();
    abstract void notifyObservers(String update, Product product);
    abstract void verhuur(Gebruiker gebruiker, Medewerker medewerker);

    public final void verhuurProces(String update, Product product, Gebruiker gebruiker, Medewerker medewerker){
       inform();
       notifyObservers(update, product);
       verhuur(gebruiker, medewerker);
    }

    public String getNaam() {
        return naam;
    }
    public org.example.productVerhuur getProductVerhuur() {
        return productVerhuur;
    }
    public String getOmschrijving() {
        return Omschrijving;
    }


}
