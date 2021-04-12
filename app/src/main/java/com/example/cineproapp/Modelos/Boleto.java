package com.example.cineproapp.Modelos;

public class Boleto {
    private double price;
    private String sits, date, time;
    private int idMovie;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSits() {
        return sits;
    }

    public void setSits(String sits) {
        this.sits = sits;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public void insertBuyOfTicket(){

    }
}
