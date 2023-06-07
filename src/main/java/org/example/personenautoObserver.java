package org.example;

public class personenautoObserver implements verhuurObserver{
    String verhuurUpdate;

    public void update(String verhuurUpdate, Product product){
        this.verhuurUpdate = verhuurUpdate;
        if (verhuurUpdate.equals("verhuurd")) {
            System.out.println("\u001B[31m! \u001B[33mVanuit auto afdeling: Het product  "+product.getNaam()+" is verhuurd!");
            product.getProductVerhuur().setVerhuurd(true);
        }else{
            System.out.println("\u001B[31m! \u001B[33mVanuit auto afdeling: Het product  "+product.getNaam()+" is succesvol geretouneerd!");
            product.getProductVerhuur().setVerhuurd(false);
        }
    }
}
