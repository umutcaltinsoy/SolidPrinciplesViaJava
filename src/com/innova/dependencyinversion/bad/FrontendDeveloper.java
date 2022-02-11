package com.innova.dependencyinversion.bad;

public class FrontendDeveloper {

    // Low level modül olarak geçen bu class
    // direkt olarak methodun detayına bağımlıdır.


    public void writeJavaScript() {
        System.out.println("Writes JS Code.");
    }
}
