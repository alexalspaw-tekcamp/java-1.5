package com.teksystems.polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println(calculator.add(2, 3));

        System.out.println(calculator.add(2.0, 3.0));
    }
}
