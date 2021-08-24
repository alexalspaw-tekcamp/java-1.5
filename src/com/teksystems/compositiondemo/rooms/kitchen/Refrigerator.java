package com.teksystems.compositiondemo.rooms.kitchen;

public class Refrigerator {
    private double interiorVolume;
    private String manufacturer;

    public Refrigerator(double interiorVolume, String manufacturer) {
        this.interiorVolume = interiorVolume;
        this.manufacturer = manufacturer;
    }

    public double getInteriorVolume() {
        return interiorVolume;
    }

    public void setInteriorVolume(double interiorVolume) {
        this.interiorVolume = interiorVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
