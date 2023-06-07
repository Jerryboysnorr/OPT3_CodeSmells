package org.example;

import java.util.ArrayList;

public class productFactory {
   static int ID = 1;
    public static Product maakProductAan(String type, String omsch, String merk, int laad, int gewicht){
       Product result = null;
       productVerhuur standaard = new productVerhuur( false, Main.huidigeGebruiker, Main.huidigeMedewerker);
       if(type.equals("boor")){result = new boorMachine("Boormachine"+(ID), omsch, standaard, merk, type);
       ID=ID+1;}
       else {
       if (type.equals("vracht")) {result = new vrachtAuto("Vrachtauto"+(ID), omsch, standaard, laad, gewicht);
       ID=ID+1;}else{
       if (type.equals("auto")) {result = new personenAuto("Personenauto"+(ID), omsch, standaard, merk, gewicht);
       ID=ID+1;}
       }}
       Main.producten.add(result);
       return result;
    }
}
