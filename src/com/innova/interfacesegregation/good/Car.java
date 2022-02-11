package com.innova.interfacesegregation.good;

// Car class'ı Vehicle ve Movable interface'lerini implement ediyor
public class Car implements Vehicle, Movable{

    // Burada sadece Car sınıfının ihtiyacı
    // doğrultusunda kullanabileceği methodlar
    // bulunmaktadır. IS'e uygun hale gelmiştir.

    double price;
    String color;

    @Override
    public void start() {
        // Logic
    }

    @Override
    public void stop() {
        // Logic
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
}
