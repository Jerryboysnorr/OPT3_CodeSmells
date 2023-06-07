package org.example;

public class vrachtautoObserver implements verhuurObserver{
    String verhuurUpdate;

    @Override
    public void update(String verhuurUpdate, Product product){
        this.verhuurUpdate = verhuurUpdate;
        if (verhuurUpdate.equals("verhuurd")) {
            System.out.println("\u001B[31m! \u001B[33mVanuit Vrachtauto afdeling: Het product  "+product.getNaam()+" is verhuurd!");
            product.getProductVerhuur().setVerhuurd(true);
        }else{
            System.out.println("\u001B[31m! \u001B[33mVanuit vrachtauto afdeling: Het product  "+product.getNaam()+" is succesvol geretouneerd!");
            product.getProductVerhuur().setVerhuurd(false);
        }
    }
}
