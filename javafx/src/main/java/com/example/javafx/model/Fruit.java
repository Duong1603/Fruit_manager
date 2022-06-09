package com.example.javafx.model;

public class Fruit {
    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Fruit.id = id;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Fruit.name = name;
    }

    public static int getQuality() {
        return quality;
    }

    public static void setQuality(int quality) {
        Fruit.quality = quality;
    }

    public static int getPrice() {
        return price;
    }

    public static void setPrice(int price) {
        Fruit.price = price;
    }

    public static int id;
    public static String name;
    public static int quality;
    public static int price;

    public Fruit(int id, String name, int quality, int price) {
        this.id = id;
        this.name = name;
        this.quality = quality;
        this.price = price;
    }
}
