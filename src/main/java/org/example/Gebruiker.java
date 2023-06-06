package org.example;

public class Gebruiker {

    public Gebruiker(String username, String password){
        this.username = username;
        this.password = password;
    }

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }
}
