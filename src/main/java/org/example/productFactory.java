package org.example;

import java.util.ArrayList;

public class productFactory {
    public static Product maakProductAan(String type){
       Product result = null;
       productVerhuur standaard = new productVerhuur("Nee nog niet", false, Main.huidigeGebruiker, Main.huidigeMedewerker);
       if(type.equals("boor")){result = new boorMachine("Boormachine", new ArrayList<verhuurObserver>(), "Boormachine.. ja...", standaard, "Siemens", "X300");
       }
       else {
       if (type.equals("vracht")) {result = new vrachtAuto("Vrachtauto", new ArrayList<verhuurObserver>(), "Een betrouwbare vrachtauto!", standaard, 300, 100);
       }else{
       if (type.equals("auto")) {result = new personenAuto("Personenauto", new ArrayList<verhuurObserver>(), "Coole auto!", standaard, "Audi", 50);
       }
       }}
       Main.producten.add(result);
       return result;
    }
}
