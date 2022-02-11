package com.innova.openclosed.bad;


public class Payment {
    public void paymentProcess(int amount, String mode) {

        // Bir markette çalıştığımızı düşünelim.
        // Durum 1 : Sadece nakit ve banka kartı
        // ile ödeme aldığımızı hayal edelim.
        // Ve bunu koda yansıtacak olursak aşağıdaki gibi görünecektir.


        if (mode.equals("Cash")) {
            // Logic
        } else if (mode.equals("Debit Card")) {
            // else-if .....
        }

        // 3.bir ödeme sistemi dahil olduğunda kod akışı aşağıdaki gibi olacaktır


//        if (mode.equals("Cash")) {
//            // Logic
//        } else if (mode.equals("Debit Card")) {
//            // logic
//        } else if (mode.equals("Credit Card")) {
//            // logic
//        } // else-if....


        // Gördüğünüz gibi if else ile gidecek olursak Open Close prensibine aykırı olacaktır.
        // Her bir yeni ödeme sistemi çıkması halinde bu iş daha karmaşık bir hal alacak ve
        // değişimi ve bakımı maliyetli bir kod ortaya çıkacaktır. OC'ye göre ilerleyecek olursak
        // good packega'ına bakalım.

    }


}
