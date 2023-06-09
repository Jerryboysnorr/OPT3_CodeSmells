package org.example;

public class productFactory {
   private static int nextId = 1;
   static productVerhuur standaard = new productVerhuur(false, Main.huidigeGebruiker, Main.huidigeMedewerker);

   public static void maakProductAan(String type, String omschrijving, String merk, int laadVermogen, int gewicht) {
      Product result;


      switch (type) {
         case "boor":
            result = createboorMachine(omschrijving, merk, type);
            break;
         case "vracht":
            result = createvrachtauto(omschrijving, laadVermogen, gewicht);
            break;
         case "auto":
            result = createpersonenAuto(omschrijving, merk, gewicht);
            break;
         default:
            throw new IllegalArgumentException("Ongeldig producttype: " + type);
      }

      Main.producten.add(result);
   }

   private static boorMachine createboorMachine(String omschrijving, String merk, String type) {
      String naam = "boorMachine" + getNextId();
      return new boorMachine(naam, omschrijving, standaard, merk, type);
   }

   private static vrachtAuto createvrachtauto(String omschrijving, int laadVermogen, int gewicht) {
      String naam = "vrachtauto" + getNextId();
      return new vrachtAuto(naam, omschrijving, standaard, laadVermogen, gewicht);
   }

   private static personenAuto createpersonenAuto(String omschrijving, String merk, int gewicht) {
      String naam = "personenAuto" + getNextId();
      return new personenAuto(naam, omschrijving, standaard, merk, gewicht);
   }

   private static int getNextId() {
      int id = nextId;
      nextId++;
      return id;
   }
}