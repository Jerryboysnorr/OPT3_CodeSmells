package org.example;

import java.util.Scanner;

public class productenBeheer {
    public static void showProductSoorten() {
        System.out.println("Maak een product aan: ");
        System.out.println("-------------------");
        System.out.println("1. Boormachine");
        System.out.println("2. Vrachtauto");
        System.out.println("3. Personenauto");

        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();

        switch (optie) {
            case "1":
                createBoormachine(scanner);
                break;
            case "2":
                createVrachtauto(scanner);
                break;
            case "3":
                createPersonenauto(scanner);
                break;
            default:
                System.out.println("Ongeldige optie");
                break;
        }

        Main.menu();
    }

    private static void createBoormachine(Scanner scanner) {
        System.out.println("Wat voor merk?");
        String merk = scanner.nextLine();
        System.out.println("Wat is de omschrijving?");
        String omsch = scanner.nextLine();

        productFactory.maakProductAan("boor", omsch, merk, 0, 0);
    }

    private static void createVrachtauto(Scanner scanner) {
        System.out.println("Wat is de omschrijving?");
        String omsch = scanner.nextLine();
        System.out.println("Wat is het laadvermogen?");
        int laadvermogen = scanner.nextInt();
        System.out.println("Wat is het gewicht?");
        int gewicht = scanner.nextInt();

        productFactory.maakProductAan("vracht", omsch, null, laadvermogen, gewicht);
    }

    private static void createPersonenauto(Scanner scanner) {
        System.out.println("Wat is de omschrijving?");
        String omsch = scanner.nextLine();
        System.out.println("Wat voor merk?");
        String merk = scanner.nextLine();
        System.out.println("Wat is het gewicht?");
        int gewicht = scanner.nextInt();

        productFactory.maakProductAan("auto", omsch, merk, 0, gewicht);
    }
}