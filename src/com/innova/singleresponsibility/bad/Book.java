package com.innova.singleresponsibility.bad;

public class Book {

    private String author;
    private String name;
    private String text;

    // Bu class için oluşturabileceklerimiz getter,setter,constructor gibi methodlardır.
    // Bunun haricinde bu sınıfın işlevine uymayacak herhangi bir method. SRP'ye aykırıdır.

    // Getters and Setters
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    // Oluşturduğumuz print() methodu SRP'ye aykırı bir methoddur.
    public void print() {
        System.out.println(text);
    }


}
