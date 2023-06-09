package org.example;

public class productFactory {
   private static int ID = 1;

   public static void maakProductAan(String type, String omschrijving, String merk, int laadVermogen, int gewicht) {
      Product result;
      productVerhuur standaard = new productVerhuur(false, Main.huidigeGebruiker, Main.huidigeMedewerker);

      result = switch (type) {
         case "boor" -> createBoorMachine(omschrijving, standaard, merk, type);
         case "vracht" -> createVrachtAuto(omschrijving, standaard, laadVermogen, gewicht);
         case "auto" -> createPersonenAuto(omschrijving, standaard, merk, gewicht);
         default -> throw new IllegalArgumentException("Ongeldig producttype: " + type);
      };

      Main.producten.add(result);
   }

   private static boorMachine createBoorMachine(String omschrijving, productVerhuur standaard, String merk, String type) {
      String naam = "Boormachine" + ID;
      ID++;
      return new boorMachine(naam, omschrijving, standaard, merk, type);
   }

   private static vrachtAuto createVrachtAuto(String omschrijving, productVerhuur standaard, int laadVermogen, int gewicht) {
      String naam = "Vrachtauto" + ID;
      ID++;
      return new vrachtAuto(naam, omschrijving, standaard, laadVermogen, gewicht);
   }

   private static personenAuto createPersonenAuto(String omschrijving, productVerhuur standaard, String merk, int gewicht) {
      String naam = "Personenauto" + ID;
      ID++;
      return new personenAuto(naam, omschrijving, standaard, merk, gewicht);
   }
}