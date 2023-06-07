package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class productenOverzicht {
    public static void showProducten(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("\u001B[36mOverzicht van producten:");
        System.out.println("========================");
        System.out.println();
        int index = 0;
        for(Product pro : Main.producten){
            index = index+1;
            System.out.println("\u001B[33m"+index);
            System.out.println("\u001B[34m"+pro.getNaam());
            System.out.println(pro.getOmschrijving());
            System.out.println();
            System.out.println("\u001B[34m-------");
            System.out.println();
        }
        System.out.println("\u001B[36mSelecteer een van de producten met hun geel-gekleurde nummer.");
        System.out.println("\u001B[36mTyp \"0\" om terug te gaan.");
        Scanner scanner = new Scanner(System.in);
        int o = scanner.nextInt();
        if(o>Main.producten.size()){
            System.out.println("\u001B[31mGeen optie, ga maar terug.");
            Main.menu();
        }else{
            if(o<=0){
                Main.menu();
            }else{
                productDetailScherm.displayDetails(Main.producten.get((o-1)));
            }
        }

    }}
