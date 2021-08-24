package com.teksystems.composition;

public class Car {
    private String color;
    private String make;
    private int numWheels;
    private Engine engine;

    public Car(String color, String make, int numWheels, Engine engine) {
        this.color = color;
        this.make = make;
        this.numWheels = numWheels;
        this.engine = engine;
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

    public int getNumWheels() {
        return numWheels;
    }

    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
