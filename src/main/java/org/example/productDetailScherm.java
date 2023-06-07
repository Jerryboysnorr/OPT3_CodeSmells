package org.example;

import java.util.Scanner;

public class productDetailScherm {

 public static void displayDetails(Product pro){
  System.out.println();
  System.out.println();
  System.out.println();
  System.out.println("\u001B[33mDetails van "+pro.getNaam()+":");
  System.out.println("----------------------------------------");
  if(pro.getProductVerhuur().isVerhuurd()){System.out.println("\u001B[31mIs verhuurd");
   System.out.println();
   System.out.println("\u001B[31mGehuurd aan:");
   System.out.println("\u001B[36m"+pro.getProductVerhuur().getGehuurdDoor().getUsername());
   System.out.println();
   System.out.println("\u001B[31mVerhuurd door:");
   System.out.println("\u001B[36m"+pro.getProductVerhuur().getVerhuurdDoor().getUsername());
   System.out.println("\u001B[31m----------------------------");
  }
  else{System.out.println("\u001B[32mIs niet verhuurd");
   System.out.println("\u001B[32mKost om te huren:");
   System.out.println("\u001B[32m$15 per minuut :P");}
  System.out.println();
  System.out.println("\u001B[36m"+pro.getOmschrijving());
  System.out.println();
  if(pro instanceof vrachtAuto auto){
   System.out.println("\u001B[34mLaadvermogen: "+auto.getLaadVermogen()+"KG");
   System.out.println("\u001B[34mGewicht: "+auto.getGewicht()+"KG");
  }
  if(pro instanceof personenAuto auto){
   System.out.println("\u001B[34mMerk: "+auto.getMerk());
   System.out.println("\u001B[34mGewicht: "+auto.getGewicht()+"KG");
  }
  if(pro instanceof boorMachine boor){
   System.out.println("\u001B[34mType: "+boor.getType());
   System.out.println("\u001B[34mMerk: "+boor.getMerk());
  }
  System.out.println("\u001B[33m==========================");
  System.out.println("\u001B[36mKies een van de volgende opties:");
  Scanner scanner = new Scanner(System.in);
  if(pro.getProductVerhuur().isVerhuurd()){
   System.out.println("\u001B[31m1. \u001B[36mRetouren");
   System.out.println("\u001B[31m2. \u001B[36mTerug");
   String optie = scanner.nextLine();
  if(optie.equals("1")){
  productRetouren.retour(pro);
  productenOverzicht.showProducten();
  }else{
   if(optie.equals("2")){
    productenOverzicht.showProducten();
   }}}
  else{
   System.out.println("\u001B[31m1. \u001B[36mHuren");
   System.out.println("\u001B[31m2. \u001B[36mTerug");
   String optie = scanner.nextLine();
   if(optie.equals("1")){
    productVerhuur.Huren(pro);
    productenOverzicht.showProducten();
   }else{
    if(optie.equals("2")){
     productenOverzicht.showProducten();
    }}}
 }}
