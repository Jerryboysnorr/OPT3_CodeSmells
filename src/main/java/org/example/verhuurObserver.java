package org.example;

public interface verhuurObserver {
    public void update(String verhuurUpdate, Product product);
}

class personenautoObserver implements verhuurObserver{
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

class vrachtautoObserver implements verhuurObserver{
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

class boormachineObserver implements verhuurObserver{
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




