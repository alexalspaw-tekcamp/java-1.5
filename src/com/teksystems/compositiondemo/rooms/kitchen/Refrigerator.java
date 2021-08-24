package com.teksystems.compositiondemo.rooms.kitchen;

public class Refrigerator {
    private int interiorVolume;
    private String manufacturer;

    public Refrigerator(int interiorVolume, String manufacturer) {
        this.interiorVolume = interiorVolume;
        this.manufacturer = manufacturer;
    }

    public int getInteriorVolume() {
        return interiorVolume;
    }

    public void setInteriorVolume(int interiorVolume) {
        this.interiorVolume = interiorVolume;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
