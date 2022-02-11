package com.innova.liskov.good;

public class TransportationVehicle {

    // LSP'ye uygun olması için engineType ve onun için oluşturduğumuz
    // getter ve setter methodlarımızı bu sınıftan çıkarmamız gerekiyor.

    // Bunun yerine 2 ayrı sınıf oluşturup TransportationVehicleWithEngine
    // ve TransportationVehicleWithoutEngine öyle ilerlememiz daha iyi olacaktır.

    private String name;
//    private String engineType;
    private double speed;

    // Getters and Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getEngineType() {
//        return engineType;
//    }
//
//    public void setEngineType(String engineType) {
//        this.engineType = engineType;
//    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
