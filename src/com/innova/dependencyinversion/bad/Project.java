package com.innova.dependencyinversion.bad;

public class Project {

    // Bu kısımda Project class'ı High level modül
    // BackendDeveloper ve FrontendDeveloper class'ları
    // ise low level modül olarak geçmektedir. Project
    // BackendDeveloper ve FrontendDeveloper'a bağımlıdır.
    // Bu durum Dependency Inversion prensibine aykırıdır.
    // Bu prensibe uymak için bir interface ile soyutlama
    // yapılmalıdır.

    private BackendDeveloper backendDeveloper = new BackendDeveloper();
    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    public void implement(){
        backendDeveloper.writeJava();
        frontendDeveloper.writeJavaScript();
    }

}
