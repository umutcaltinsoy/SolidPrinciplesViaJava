package com.innova.openclosed.good;

public class Payment {

    public void paymentProcessing(PaymentType payType) {
        payType.paymentType();
    }


    // Burada ise PaymentType adında bir interface tanımladık
    // her bir ödeme türü için bir class oluşturduk ve her class
    // bu interface'i implement etti. Böylelikle kaç tane ödeme
    // sistemi çıkarsa çıksın kodumuz bundan etkilenmeyecek ve
    // gerekli implementasyon ile kendi yapmak istediğini yapacak.

}
