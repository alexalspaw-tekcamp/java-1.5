package com.teksystems.compositiondemo;

import com.teksystems.compositiondemo.rooms.kitchen.Kitchen;
import com.teksystems.compositiondemo.yard.Yard;

public class House {
    private int squareFootage;
    private int numBedrooms;
    private double numBathrooms;

    // composition using our own classes
    private Kitchen kitchen;
    private Yard yard;

    public House(int squareFootage, int numBedrooms, double numBathrooms, Kitchen kitchen, Yard... yard) {
        this.squareFootage = squareFootage;
        this.numBedrooms = numBedrooms;
        this.numBathrooms = numBathrooms;
        this.kitchen = kitchen;
        if (yard == null) {
            this.yard = new Yard();
        }
    }

    public int getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(int squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNumBedrooms() {
        return numBedrooms;
    }

    public void setNumBedrooms(int numBedrooms) {
        this.numBedrooms = numBedrooms;
    }

    public double getNumBathrooms() {
        return numBathrooms;
    }

    public void setNumBathrooms(double numBathrooms) {
        this.numBathrooms = numBathrooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }
}
