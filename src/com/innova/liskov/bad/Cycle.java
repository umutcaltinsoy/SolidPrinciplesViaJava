package com.innova.liskov.bad;

// Cycle class'ı TransportationVehicle class'ını miras alıyor
public class Cycle extends TransportationVehicle{

    int price = 0 ;

    // Bisikletin motor bulunmadığı için, setEngineType methodunun kullanımı anlamsızdır.
    // Ve Cycle sınıfımız bu methodu override ederse LSP'ye aykırı bir durum söz konusudur.


    @Override
    public void setEngineType(String engineType) {
        // herhangi bir şey yapmamalıyız çünkü bisikletin motoru yok.
    }
}
