package com.innova.dependencyinversion.good;

public class Project {

   // Artık High level olan Project modülümüz Low level olan
    // BackendDeveloper ve FrontendDeveloper modüllerine
    // doğrudan bağımlı olmadığı için kodumuzdan çıkardık.
    // Comment'e aldık

//    private BackendDeveloper backendDeveloper = new BackendDeveloper();
//    private FrontendDeveloper frontendDeveloper = new FrontendDeveloper();

    // Artık Developer'ı reference alacak
    public void implement(Developer developer){
        // BackendDeveloper ve FrontendDeveloper objelerini kullanarak
        // writeJava ve writeJavaScript methodlarını çağırmak yerine
        // Developer kullanacağız.

//        backendDeveloper.writeJava();
//        frontendDeveloper.writeJavaScript();

        developer.develop();

    }

}
