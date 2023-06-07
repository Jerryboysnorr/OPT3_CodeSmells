package org.example;

import java.util.ArrayList;

public class productVerhuur {


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
