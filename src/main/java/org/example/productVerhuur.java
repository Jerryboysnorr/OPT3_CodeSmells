package org.example;

public class productVerhuur {

    private String verhuurUpdate;
    private boolean verhuurd;
    private Gebruiker gehuurdDoor;
    private Medewerker verhuurdDoor;

    public productVerhuur(String verhuurUpdate, boolean verhuurd, Gebruiker gehuurdDoor, Medewerker verhuurdDoor){
        this.verhuurUpdate = verhuurUpdate;
        this.verhuurd = verhuurd;
        this.gehuurdDoor = gehuurdDoor;
        this.verhuurdDoor = verhuurdDoor;
    }

    public boolean isVerhuurd() {
        return verhuurd;
    }
}
