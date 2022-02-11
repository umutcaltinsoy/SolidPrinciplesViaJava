package com.innova.interfacesegregation.bad;

// Car implements Vehicle interface
public class Car implements Vehicle {

    // Aşağıda Vehicle interface'den gelen tüm
    // override edilebilir methodları görüyoruz
    // Ancak arabamız uçamayacağı için fly() methodu
    // burada gereksizdir ve IS prensibine aykırıdır.
    // Bu sorunu çözmek için her bir taşıtın kendine
    // özgü işlevsellik kazanabileceği şekilde
    // interfaceler oluşturmamız IS prensibine
    // uymamızı sağlayacaktır.


    double price;
    String color;

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void setColor(String Color) {
        this.color = color;
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
    public void fly() {
        // Logic
    }
}
