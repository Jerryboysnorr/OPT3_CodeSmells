package org.example;

import java.util.Scanner;

public class productenBeheer {
    public static void showProductSoorten(){
        System.out.println("Maak een product aan: ");
        System.out.println("-------------------");
        System.out.println("1. Boormachine");
        System.out.println("2. Vrachtauto");
        System.out.println("3. Personenauto");
        Scanner scanner = new Scanner(System.in);
        String optie = scanner.nextLine();
        if(optie.equals("1")){
        productFactory.maakProductAan("boor");
        }else{
            if(optie.equals("2")){
            productFactory.maakProductAan("vracht");
            }else{
                if(optie.equals("3")){
                productFactory.maakProductAan("auto");
                }
            }
        }
        Main.menu();
    }
}
