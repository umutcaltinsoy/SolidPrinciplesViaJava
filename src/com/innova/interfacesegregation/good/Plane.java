package com.innova.interfacesegregation.good;

public class Plane implements Vehicle, Movable, Flyable{

    double price;
    String color;

    @Override
    public void fly() {
        // Logic
    }

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
