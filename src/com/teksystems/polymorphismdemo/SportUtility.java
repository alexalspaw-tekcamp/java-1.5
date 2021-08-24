package com.teksystems.polymorphismdemo;

public class SportUtility extends Vehicle {
    public SportUtility(String color, String make, String model) {
        super(color, make, model);
    }

    public String honk() {
        return "Fancy honk!";
    }
}
