package com.innova.dependencyinversion.good;

public class BackendDeveloper implements Developer{

    // Developer interface'den gelen method
    // Artık sınıfımız writeJavaScript
    // methoduna doğrudan bağımlı değil
    @Override
    public void develop() {
        this.writeJava();
    }

    public void writeJava() {
        System.out.println("Writes Java Code.");
    }
}
