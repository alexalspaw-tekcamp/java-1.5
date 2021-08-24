package com.teksystems.polymorphismdemo;

public class Truck extends Vehicle {
    public Truck(String color, String make, String model) {
        super(color, make, model);
    }

    public String honk() {
        return "HONK HONK!";
    }
}
