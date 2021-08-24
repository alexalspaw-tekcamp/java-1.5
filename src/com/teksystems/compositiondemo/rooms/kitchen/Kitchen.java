package com.teksystems.compositiondemo.rooms.kitchen;

import com.teksystems.compositiondemo.rooms.Room;

public class Kitchen extends Room {
    private Cabinets cabinets;
    private Counters counters;
    private Refrigerator refrigerator;

    public Kitchen(Cabinets cabinets, Counters counters, Refrigerator refrigerator) {
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
