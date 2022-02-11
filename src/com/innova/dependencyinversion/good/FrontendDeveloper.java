package com.innova.dependencyinversion.good;

public class FrontendDeveloper implements Developer{

    // Developer interface'den gelen method
    // Artık sınıfımız writeJavaScript
    // methoduna doğrudan bağımlı değil
    @Override
    public void develop() {
        this.writeJavaScript();
    }

    public void writeJavaScript() {
        System.out.println("Writes JS Code.");
    }
}
