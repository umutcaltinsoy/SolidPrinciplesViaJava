package com.innova.liskov.bad;

// Car class'ı TransportationVehicle class'ını miras alıyor
public class Car extends TransportationVehicle{
    public int price = 1000;

    @Override
    public void setEngineType(String engineType) {
        // logic
        if (engineType.equals("Petrol")) {
            this.price = this.price + 500;
        } else {
            this.price = this.price + 10000;
        }
    }
}
