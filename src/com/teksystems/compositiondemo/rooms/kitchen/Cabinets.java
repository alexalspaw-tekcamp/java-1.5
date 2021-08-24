package com.teksystems.compositiondemo.rooms.kitchen;

public class Cabinets {
    private int shelves;
    private String woodType;

    public Cabinets(String woodType) {
        this.shelves = 3;
        this.woodType = woodType;
    }

    public Cabinets(int shelves, String woodType) {
        this.shelves = shelves;
        this.woodType = woodType;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public String getWoodType() {
        return woodType;
    }

    public void setWoodType(String woodType) {
        this.woodType = woodType;
    }
}
