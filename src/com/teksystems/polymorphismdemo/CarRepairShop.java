package com.teksystems.polymorphismdemo;

public class CarRepairShop {
    public static void main(String[] args) {
        Technician alex = new Technician("Alex");

        Vehicle customerCoupe = new Coupe("yellow", "porsche", "911");
        Vehicle customerSUV = new SportUtility("blue", "cadillac", "escalade");
        Vehicle customerTruck = new Truck("red", "ford", "f-250");

        System.out.println(alex.repair(customerCoupe));

        System.out.println(alex.repair(customerSUV));

        System.out.println(alex.repair(customerTruck));
    }
}
