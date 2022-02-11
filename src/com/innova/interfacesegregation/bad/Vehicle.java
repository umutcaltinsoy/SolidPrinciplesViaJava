package com.innova.interfacesegregation.bad;

public interface Vehicle {

    // Class'larımızın kullanımı için aşağıdaki
    // gibi gövdesiz methodlar oluşturduk.

    void setPrice(double price);
    void setColor(String Color);
    void start();
    void stop();
    void fly();
}
