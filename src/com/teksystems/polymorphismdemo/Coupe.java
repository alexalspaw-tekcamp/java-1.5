package com.teksystems.polymorphismdemo;

public class Coupe extends Vehicle {
    public Coupe(String color, String make, String model) {
        super(color, make, model);
    }

    public String honk() {
        return "Fast honk!";
    }
}
