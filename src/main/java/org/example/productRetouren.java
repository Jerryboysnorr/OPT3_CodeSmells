package org.example;

public class productRetouren {
    public static void retour(Product pro){
        String up = "beschikbaar";
        Main.vm.setVerhuurUpdate(up, pro);
        pro.getProductVerhuur().setVerhuurd(false);
        pro.getProductVerhuur().setGehuurdDoor(null);
        pro.getProductVerhuur().setVerhuurdDoor(null);
    }
}

