package org.example;

import java.util.ArrayList;

public class productFactory {
   static int ID = 1;

   public static Product maakProductAan(String type, String omsch, String merk, int laad, int gewicht) {
      Product result = null;
      productVerhuur standaard = new productVerhuur(false, Main.huidigeGebruiker, Main.huidigeMedewerker);

      if (type.equals("boor")) {
         result = createBoorMachine(omsch, standaard, merk, type);
      } else if (type.equals("vracht")) {
         result = createVrachtAuto(omsch, standaard, laad, gewicht);
      } else if (type.equals("auto")) {
         result = createPersonenAuto(omsch, standaard, merk, gewicht);
      }

      Main.producten.add(result);
      return result;
   }

   private static boorMachine createBoorMachine(String omsch, productVerhuur standaard, String merk, String type) {
      String naam = "Boormachine" + ID;
      ID++;
      return new boorMachine(naam, omsch, standaard, merk, type);
   }

   private static vrachtAuto createVrachtAuto(String omsch, productVerhuur standaard, int laad, int gewicht) {
      String naam = "Vrachtauto" + ID;
      ID++;
      return new vrachtAuto(naam, omsch, standaard, laad, gewicht);
   }

   private static personenAuto createPersonenAuto(String omsch, productVerhuur standaard, String merk, int gewicht) {
      String naam = "Personenauto" + ID;
      ID++;
      return new personenAuto(naam, omsch, standaard, merk, gewicht);
   }
}
