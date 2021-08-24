package com.teksystems.compositiondemo.rooms.kitchen;

public class Counters {
    private int height;
    private String counterMaterial;

    public Counters(String counterMaterial) {
        this.height = 4;
        this.counterMaterial = counterMaterial;
    }

    public Counters(int height, String counterMaterial) {
        this.height = height;
        this.counterMaterial = counterMaterial;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getCounterMaterial() {
        return counterMaterial;
    }

    public void setCounterMaterial(String counterMaterial) {
        this.counterMaterial = counterMaterial;
    }
}
