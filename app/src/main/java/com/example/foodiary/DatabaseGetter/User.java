package com.example.foodiary.DatabaseGetter;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String surname;
    private String username;
    private String password;
    private ArrayList<StockProduct> stock = new ArrayList<StockProduct>();
    private List<String> approachingExpirationDate = new ArrayList<String>();
    private List<String> notApproachingExpirationDate = new ArrayList<String>();
    private String mail;

    public User(String name,String surname,String username,String mail,String password){
        this.name = name;
        this.surname = surname;
        this.mail = mail;
        this.username = username;
        this.password = password;
        date();
    }

    public void date() {//burda sktsi yaklaşanlara bakıcam yaklaşanları approachinge diğerlerini de diğer listeye atıcam
    }

    public ArrayList<StockProduct> getStock() {
        return stock;
    }

    public void addToStock(StockProduct product) {
        stock.add(product);
    }

    public void removeFromStock(StockProduct product) {
        stock.remove(product);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<String> getApproachingExpirationDate() {
        return approachingExpirationDate;
    }

    public void setApproachingExpirationDate(String product) {
        approachingExpirationDate.add(product);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
