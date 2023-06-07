package org.example;

public class boormachineObserver implements verhuurObserver{
    String verhuurUpdate;

@Override
    public void update(String verhuurUpdate, Product product){
this.verhuurUpdate = verhuurUpdate;
    if (verhuurUpdate.equals("verhuurd")) {
        System.out.println("\u001B[31m! \u001B[33mVanuit boormachine afdeling: Het product  "+product.getNaam()+" is verhuurd!");
        product.getProductVerhuur().setVerhuurd(true);
    }else{
        System.out.println("\u001B[31m! \u001B[33mVanuit boormachine afdeling: Het product "+product.getNaam()+" is succesvol geretouneerd!");
        product.getProductVerhuur().setVerhuurd(false);
    }
    }
}
