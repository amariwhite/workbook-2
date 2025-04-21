package com.pluralsight;

public class Vehicle {
    private int id;
    private String makeModel;
    private String color;
    private double price;

    public Vehicle(int id, String makeModel, String color, double price) {
        this.id = id;
        this.makeModel = makeModel;
        this.color = color;
        this.price = price;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", makeModel='" + makeModel + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
