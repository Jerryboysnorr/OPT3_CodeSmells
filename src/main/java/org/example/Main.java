package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Gebruiker huidigeGebruiker;
    public static Medewerker huidigeMedewerker;
    public static ArrayList<Product> producten = new ArrayList<>();

    /*

    TO DO:

    OBSERVER PATTERN
    TEMPLATE METHOD PATTERN
    VERHUUR PRODUCT
    RETURN PRODUCT
    
     */

    public static void main(String[] args) {
    Gebruiker gebruiker = new Gebruiker("Figgo", "ja");
    huidigeGebruiker = gebruiker;
    Medewerker medewerker = new Medewerker("jeroen", "okay");
    huidigeMedewerker = medewerker;

    producten.add(
            new boorMachine("Boormachine", new ArrayList<verhuurObserver>(), "De eerste beste boormachine.", new productVerhuur("Nee nog niet", false, huidigeGebruiker, medewerker), "Siemens", "X1")
    );

    menu();
    }

    public static void menu(){
        System.out.println();
        System.out.println();
        System.out.println("Kies een van de opties:");
        System.out.println("Ingelogd als: "+huidigeGebruiker.getUsername());
        System.out.println("=================");
        System.out.println("1. Overzicht");
        System.out.println("2. Beheervenster");
        System.out.println("3. Uitloggen");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
        if(optie.equals("1")){
            productenOverzicht.showProducten();
        }else{
            if(optie.equals("2")){
            productenBeheer.showProductSoorten();
            }else{
                if(optie.equals("3")){
                System.out.println();
                }
            }
        }

    }
}