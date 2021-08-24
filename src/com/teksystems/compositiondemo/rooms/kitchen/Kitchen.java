package com.teksystems.compositiondemo.rooms.kitchen;

import com.teksystems.compositiondemo.rooms.Room;

public class Kitchen extends Room {
    private Cabinets cabinets;
    private Counters counters;
    private Refrigerator refrigerator;

    public Kitchen(String cabinetsDefaultShelves, String countersDefaultHeight, Refrigerator refrigerator) {
        super(10, 12);
        this.cabinets = new Cabinets(cabinetsDefaultShelves);
        this.counters = new Counters(countersDefaultHeight);
        this.refrigerator = refrigerator;
    }

    public Kitchen(int kitchenWidth,
                   int kitchenHeight,
                   Cabinets cabinets,
                   Counters counters,
                   Refrigerator refrigerator) {
        super(kitchenWidth, kitchenHeight);
        this.cabinets = cabinets;
        this.counters = counters;
        this.refrigerator = refrigerator;
    }

    public Cabinets getCabinets() {
        return cabinets;
    }

    public void setCabinets(Cabinets cabinets) {
        this.cabinets = cabinets;
    }

    public Counters getCounters() {
        return counters;
    }

    public void setCounters(Counters counters) {
        this.counters = counters;
    }

    public Refrigerator getRefrigerator() {
        return refrigerator;
    }

    public void setRefrigerator(Refrigerator refrigerator) {
        this.refrigerator = refrigerator;
    }
}
