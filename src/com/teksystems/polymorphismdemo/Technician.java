package com.teksystems.polymorphismdemo;

public class Technician {
    private String name;
    private Vehicle vehicle;

    public Technician(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String repair(Vehicle theVehicle) {
        return theVehicle.honk() + " The " + theVehicle.getColor() + " " + theVehicle.getMake() + " has been repaired!";
    }
}
