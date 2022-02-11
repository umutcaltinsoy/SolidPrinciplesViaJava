package com.innova.liskov.good;

public class Cycle extends TransportationVehicleWithoutEngine{

    int price = 0 ;

    @Override
    public String move() {
        return super.move();
    }


    // Artık setEngineType methodunu override etmemize gerek kalmadı
//    @Override
//    public void setEngineType(String engineType) {
//        // herhangi bir şey yapmamalıyız çünkü bisikletin motoru yok.
//    }

}
