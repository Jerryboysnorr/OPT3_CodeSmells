package org.example;

import java.util.ArrayList;
import java.util.Observer;

abstract class Product {

    public Product(String naam, ArrayList<Observer> observers, String Omschrijving, String verhuurUpdate, boolean verhuurd, Gebruiker gehuurdDoor, Medewerker verhuurdDoor){
        this.naam = naam;
        this.observers = observers;
        this.Omschrijving = Omschrijving;
        this.verhuurUpdate = verhuurUpdate;
        this.verhuurd = verhuurd;
        this.gehuurdDoor = gehuurdDoor;
        this.verhuurdDoor = verhuurdDoor;
    }

    private ArrayList<Observer> observers = new ArrayList<>();
    private String naam;

    private String Omschrijving;
    private String verhuurUpdate;
    private boolean verhuurd;
    private Gebruiker gehuurdDoor;
    private Medewerker verhuurdDoor;

    void verhuurProces(){

    }

    public String getNaam() {
        return naam;
    }

    public ArrayList<Observer> getObservers() {
        return observers;
    }

    public Gebruiker getGehuurdDoor() {
        return gehuurdDoor;
    }

    public Medewerker getVerhuurdDoor() {
        return verhuurdDoor;
    }

    public String getOmschrijving() {
        return Omschrijving;
    }

    public String getVerhuurUpdate() {
        return verhuurUpdate;
    }

    public boolean isVerhuurd() {
        return verhuurd;
    }
}
