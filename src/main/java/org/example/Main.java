package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Gebruiker huidigeGebruiker;
    public static Medewerker huidigeMedewerker;
    public static ArrayList<Product> producten = new ArrayList<>();
    public static verhuurManager vm = new verhuurManager();

    public static void main(String[] args) {
    vm.setObservers();
    huidigeGebruiker = new Gebruiker("Figgo", "ja");
    huidigeMedewerker = new Medewerker("jeroen", "okay");
    producten.add(
            new boorMachine("Boormachine", "De eerste beste boormachine.", new productVerhuur(false, huidigeGebruiker, huidigeMedewerker), "Siemens", "X1")
    );

    menu();
    }


    public static void menu() {
        System.out.println();
        System.out.println();
        System.out.println("Kies een van de opties:");
        System.out.println("Ingelogd als: " + huidigeGebruiker.getUsername());
        System.out.println("=================");
        System.out.println("1. Overzicht");
        System.out.println("2. Beheervenster");
        System.out.println("3. Uitloggen");

        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();

        processMenuChoice(optie);
    }

    private static void processMenuChoice(String optie) {
        switch (optie) {
            case "1":
                productenOverzicht.showProducten();
                break;
            case "2":
                productenBeheer.showProductSoorten();
                break;
            case "3":
                System.out.println("Uitloggen...");
                break;
            default:
                System.out.println("Ongeldige optie, probeer opnieuw.");
                menu();
                break;
        }
    }
}