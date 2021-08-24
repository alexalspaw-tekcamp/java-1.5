package com.teksystems.compositiondemo;

import com.teksystems.compositiondemo.rooms.kitchen.Cabinets;
import com.teksystems.compositiondemo.rooms.kitchen.Counters;
import com.teksystems.compositiondemo.rooms.kitchen.Kitchen;
import com.teksystems.compositiondemo.rooms.kitchen.Refrigerator;

public class HouseApplication {
    public static void main(String[] args) {
//        Cabinets cabinets = new Cabinets(3, "Maple");
//        Counters counters = new Counters(4, "Granite");
        Refrigerator refrigerator = new Refrigerator(12.8, "KitchenAid");
        Kitchen fancyKitchen = new Kitchen("Maple", "Granite", refrigerator);
        House myHouse = new House(1400,3,2, fancyKitchen);
    }
}
