package com.innova.dependencyinversion.bad;

public class BackendDeveloper {

    // Low level modül olarak geçen bu class
    // direkt olarak methodun detayına bağımlıdır.

    public void writeJava() {
        System.out.println("Writes Java Code.");
    }
}
