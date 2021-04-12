package com.example.cineproapp.Modelos;

public class Usuario {
    private String user, telephone, password;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean validateUser(){
        boolean login = false;
        if(user.equals("Moises") && password.equals("1234")){
            login = true;
        }
        return login;
    }

    public void buyTicket(double money){

    }

    public void buyFood(double money){

    }

    public Double consultMoney(double Money){
        return Money;
    }
}
