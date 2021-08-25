package com.teksystems.polymorphismdemo;

public class Vehicle {
    private String color;
    private String make;
    private String model;

    public Vehicle(String color, String make, String model) {
        this.color = color;
        this.make = make;
        this.model = model;
    }

    public String honk() {
        return "honk";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
