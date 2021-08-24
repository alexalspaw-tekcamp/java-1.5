package com.teksystems.compositiondemo.rooms;

public class Room {
    private int ceilingHeight;
    private int width;
    private int length;

    public Room(int width, int length) {
        this.ceilingHeight = 9;
        this.width = width;
        this.length = length;
    }

    public Room(int ceilingHeight, int width, int length) {
        this.ceilingHeight = ceilingHeight;
        this.width = width;
        this.length = length;
    }

    public int getCeilingHeight() {
        return ceilingHeight;
    }

    public void setCeilingHeight(int ceilingHeight) {
        this.ceilingHeight = ceilingHeight;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
}
