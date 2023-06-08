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
class productVerhuur {


    private boolean verhuurd;
    private Gebruiker gehuurdDoor;
    private Medewerker verhuurdDoor;

    public productVerhuur(boolean verhuurd, Gebruiker gehuurdDoor, Medewerker verhuurdDoor){
        this.verhuurd = verhuurd;
        this.gehuurdDoor = gehuurdDoor;
        this.verhuurdDoor = verhuurdDoor;
    }


    public boolean isVerhuurd() {
        return verhuurd;
    }

    public void setVerhuurd(boolean verhuurd) {
        this.verhuurd = verhuurd;
    }

    public Gebruiker getGehuurdDoor() {
        return gehuurdDoor;
    }

    public Medewerker getVerhuurdDoor() {
        return verhuurdDoor;
    }

    public static void Huren(Product pro){
        String up = "verhuurd";
        pro.verhuurProces(up, pro, Main.huidigeGebruiker, Main.huidigeMedewerker);
    }

    public void setGehuurdDoor(Gebruiker gehuurdDoor) {
        this.gehuurdDoor = gehuurdDoor;
    }

    public void setVerhuurdDoor(Medewerker verhuurdDoor) {
        this.verhuurdDoor = verhuurdDoor;
    }
}

class boorMachine extends Product{
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

class personenAuto extends Product{
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

class vrachtAuto extends Product{
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




