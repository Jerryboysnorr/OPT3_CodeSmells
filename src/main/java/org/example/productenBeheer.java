package org.example;

import java.util.Scanner;

public class productenBeheer {
    public static void showProductSoorten() {
        String merk;
        String omsch;
        int getal;
        int getal1;
        System.out.println("Maak een product aan: ");
        System.out.println("-------------------");
        System.out.println("1. Boormachine");
        System.out.println("2. Vrachtauto");
        System.out.println("3. Personenauto");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
        if (optie.equals("1")) {
            System.out.println("Wat voor merk?");
            merk=scanner.nextLine();
            System.out.println("Wat is de omschrijving?");
            omsch=scanner.nextLine();
            productFactory.maakProductAan("boor",omsch,merk,0,0);
        } else {
            if (optie.equals("2")) {
                System.out.println("Wat is de omschrijving?");
                omsch=scanner.nextLine();
                System.out.println("Wat is het laadvermogen?");
                getal=scanner.nextInt();
                System.out.println("Wat is het gewicht?");
                getal1=scanner.nextInt();
                productFactory.maakProductAan("vracht",omsch,null,getal,getal1);
            } else {
                if (optie.equals("3")) {
                    System.out.println("Wat is de omschrijving?");
                    omsch=scanner.nextLine();
                    System.out.println("Wat voor merk?");
                    merk=scanner.nextLine();
                    System.out.println("Wat is het gewicht?");
                    getal=scanner.nextInt();
                    productFactory.maakProductAan("auto",omsch,merk,0,getal);
                }
            }
        }
        Main.menu();
    }


}
