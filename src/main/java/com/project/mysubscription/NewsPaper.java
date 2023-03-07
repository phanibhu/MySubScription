package com.project.mysubscription;

public class NewsPaper {
    private String name;
    private double price[];

    public NewsPaper(String name, double[] price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double[] getPrice() {
        return price;
    }
}
