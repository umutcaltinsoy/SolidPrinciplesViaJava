package com.innova.liskov.good;

public class TransportationVehicleWithEngine extends TransportationVehicle{


    private String engineType;

    // Getter and Setter
    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
