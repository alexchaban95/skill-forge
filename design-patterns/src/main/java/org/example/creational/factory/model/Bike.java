package org.example.creational.factory.model;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivering by bike");
    }
}
