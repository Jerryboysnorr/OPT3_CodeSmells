package org.example;

import java.util.ArrayList;

public class productenOverzicht {
    public static void showProducten(){

        System.out.println("Overzicht van producten:");
        System.out.println("========================");
        for(Product pro : Main.producten){
            System.out.println(pro.getNaam());
            System.out.println(pro.getOmschrijving());
            if(pro.isVerhuurd()){System.out.println("Is verhuurd");}
            else{System.out.println("Is niet verhuurd");}

        }
    }
}
