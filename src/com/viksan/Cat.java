package com.viksan;

public class Cat {

    String name;
    int age;

    //для домашних котов
    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //для уличных котов
    public Cat() {
    }

    public static void main(String[] args) {

        Cat barsik = new Cat("Barsik", 5);
        Cat streetCat = new Cat("gh",4);
        System.out.println(barsik.name + " " + barsik.age);
        System.out.println(streetCat.name + streetCat.age);
    }
}
