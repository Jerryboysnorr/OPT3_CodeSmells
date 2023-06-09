package org.example;

import java.util.Scanner;

public class productenOverzicht {
    public static void showProducten() {
        printHeader();
        printProducten();
        handleUserInput();
    }

    private static void printHeader() {
        System.out.println("\n\n\n\u001B[36mOverzicht van producten:");
        System.out.println("========================\n");
    }

    private static void printProducten() {
        int index = 0;
        for (Product product : Main.producten) {
            index++;
            System.out.println("\u001B[33m" + index);
            System.out.println("\u001B[34m" + product.getNaam());
            System.out.println(product.getOmschrijving());
            System.out.println();
            System.out.println("\u001B[34m-------");
            System.out.println();
        }
    }

    private static void handleUserInput() {
        System.out.println("\u001B[36mSelecteer een van de producten met hun geel-gekleurde nummer.");
        System.out.println("\u001B[36mTyp \"0\" om terug te gaan.");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        if (userInput > 0 && userInput <= Main.producten.size()) {
            productDetailScherm.displayDetails(Main.producten.get(userInput - 1));
        } else {
            System.out.println("\u001B[31mGeen optie, ga maar terug.");
            Main.menu();
        }
    }
}