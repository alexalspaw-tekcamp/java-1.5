package com.teksystems.composition;

public class Engine {
    private int horsePower;
    private int numCylinders;

    public void start() {
        System.out.println("The engine started");
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getNumCylinders() {
        return numCylinders;
    }

    public void setNumCylinders(int numCylinders) {
        this.numCylinders = numCylinders;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "horsePower=" + horsePower +
                ", numCylinders=" + numCylinders +
                '}';
    }
}
