package com.teksystems.composition;

public class CompositionMain {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setHorsePower(500);
        engine.setNumCylinders(8);
        Car car = new Car("grey", "Toyota", 4, engine);
        System.out.println(car.getEngine());
    }
}
